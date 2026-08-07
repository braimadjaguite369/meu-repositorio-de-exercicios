//
// Created by HP 9470 on 04/01/2026.
//
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "frotas.h"

void inicializarFrota(Frota *frota) {
    frota->contador = 0;
    frota->capacidade = FROTA_CAPACIDADE_INICIAL;
    frota->camioes = (Camiao*)malloc(FROTA_CAPACIDADE_INICIAL*sizeof(Camiao));
}
void libertaFrota(Frota *frota) {
    if (frota->camioes) {
        free(frota->camioes);
        frota->camioes = NULL;
    }
    frota = NULL;
    printf("libertado com sucesso!\n");
}
int insereCamiao(Frota *frota) {
    char matricula[MATRICULA_TAM];
    printf("Matricula: ");
    scanf("%s", matricula);
    for (int i = 0; i < frota->contador; i++) {
        if (strcmp(frota->camioes[i].matricula, matricula) == 0) {
            printf("Esta matricula já existe");
            return 0;
        }
    }
    if (frota->contador == frota->capacidade) {
        Camiao *temp = (Camiao*)realloc(frota->camioes, sizeof(Camiao)*frota->capacidade*2);
        if (temp == NULL) {
            printf("Nao foi possivel expandir a memoria.");
            exit(EXIT_FAILURE);
        }
        frota->camioes = temp;
        frota->capacidade *= 2;
    }
    strcpy(frota->camioes[frota->contador].matricula, matricula);
    frota->camioes[frota->contador].contador = 0;
    frota->contador++;
    printf("Inserido com sucesso!\n");
 return 1;
}
int daPosicaoCamiao(Frota frota, char *matricula) {
    int posicao = -1;
    for (int i = 0; i < frota.contador && posicao == -1; i++) {
        if (strcmp(frota.camioes[i].matricula, matricula) == 0) {
            posicao = i;
        }
    }
    return posicao;
}
int existe(Frota frota, char *matricula) {
    return daPosicaoCamiao(frota, matricula) > -1 ? 1 : 0;
}
int insereKms(Frota *frota, char *matricula, int km) {
int posicao;
    if ((existe(*frota, matricula)) == 0) {
        printf("A matricula nao encontrada.");
        return -1;
    }
    posicao = daPosicaoCamiao(*frota, matricula);
    if (frota->camioes[posicao].contador == KMS_CAPACIDADE) {
        printf("A capacidade maxima de arrey do km atingido.");
        return -2;
    }
    frota->camioes[posicao].km[frota->camioes[posicao].contador] = km;
    printf("KM inserido com sucesso!\n");
   return 1;
}
void mostraCamioesFrota(Frota frota) {
    for (int i = 0; i < frota.contador; i++) {
        printf("Matricula: %s  #km : %d\n", frota.camioes[i].matricula, frota.camioes[i].contador);
        printf("Km: ");
        for (int j = 0; j < frota.camioes[i].contador; j++) {
            if(j > 0) {
                printf(", ");
            }
            printf("%d", frota.camioes[i].km[j]);
        }
    }
}
void mostra(int *valores, int n) {
    for (int i = 0; i < n; i++) {
        if (i > 0) {
            printf(", ");
        }
        printf("%d", valores[i]);
    }
}
void guardaFrota(Frota frota, char *ficheiro) {
FILE *fp = fopen(ficheiro, "wb");
    if (fp == NULL) {
        printf("Arquivo nao foi aberto");
        exit(EXIT_FAILURE);
    }
    fwrite(&frota.contador, sizeof(int), 1, fp);
    fwrite(&frota.capacidade, sizeof(int), 1, fp);
    fwrite(frota.camioes, sizeof(Camiao), frota.contador, fp);
    fclose(fp);
    printf("Ficheiros guardados com sucesso!\n");
}
void carregaFrota(Frota *frota, char *ficheiro) {
    FILE *fp = fopen(ficheiro, "rb");
    if (fp == NULL) {
        printf("Nao foi possivel abrir o arquivo");
        exit(EXIT_FAILURE);
    }
    fread(&frota->contador, sizeof(int), 1, fp);
    fread(&frota->capacidade, sizeof(int), 1, fp);

    frota->camioes = (Camiao*)malloc(sizeof(Camiao) * frota->capacidade);
    if (frota->camioes == NULL) {
            printf("O arquivo foi carregado, mas nao foi possivel expandir a memoria");
            exit(EXIT_FAILURE);
        }
    fread(frota->camioes, sizeof(Camiao), frota->contador, fp);
    fclose(fp);
    printf("Ficheiros carregados com sucesso!\n");
}

//
// Created by HP 9470 on 04/01/2026.
//

#ifndef TESTEMODELO_FROTAS_H
#define TESTEMODELO_FROTAS_H
#define FROTA_CAPACIDADE_INICIAL 2
#define KMS_CAPACIDADE 6
#define MATRICULA_TAM 10
typedef struct {
    int contador;
    char matricula[MATRICULA_TAM];
    int km[KMS_CAPACIDADE];
} Camiao;
typedef struct {
    int contador;
    int capacidade;
    Camiao *camioes;
} Frota;
void inicializarFrota(Frota *frota);
void libertaFrota(Frota *frota);
int insereCamiao(Frota *frota);
int daPosicaoCamiao(Frota frota, char *matricula);
int existe(Frota frota, char *matricula);
int insereKms(Frota *frota, char *matricula, int km);
void mostraCamioesFrota(Frota frota);
void mostra(int *valores, int n);
void guardaFrota(Frota frota, char *ficheiro);
void carregaFrota(Frota *frota, char *ficheiro);

#endif //TESTEMODELO_FROTAS_H
#include <stdio.h>
#include <stdlib.h>
#include "frotas.h"

int main() {
    Frota frota;
      //int op;
    int resposta;
    char *nomeFicheiro = "frota.bin";
    inicializarFrota(&frota);
    int op;
    do {
        printf("\nAS OPCOES\n");
        printf("0= sair, 1= libertar, 2= inserir, 3=posicao do camiao, 4= se existe\n");
        printf("5=inserirKm, 6=mostrar camioes, 7=guardar,8=carregar\n");
        scanf("%d", &op);
        switch (op) {
            case 1:
                libertaFrota(&frota); break;
            case 2:
                insereCamiao(&frota); break;
            case 3: {
                char matricula[MATRICULA_TAM];
                printf("Informe a matricula (10 digiros)");
                scanf("%s", matricula);
                resposta = daPosicaoCamiao(frota, matricula);
                if (resposta > -1) {
                    printf("Posicao %d", resposta);
                }
                break;
            }
            case 4: {
                char matricula[MATRICULA_TAM];
                printf("Informe a matricula (10 digiros)");
                scanf("%s", matricula);
                resposta = existe(frota, matricula);
                if (resposta == 1) {
                    printf("Ele existe.\n");
                } else {
                    printf("Nao existe.\n");
                }
                break;
            }
            case 5: {
                char matricula[MATRICULA_TAM];
                int km;
                printf("Informe a matricula (10 digiros)");
                scanf("%s", matricula);
                printf("Informe o km");
                scanf(" %d", &km);
                insereKms(&frota, matricula, km); break;
            }
            case 6:
                mostraCamioesFrota(frota); break;
            case 7:
                guardaFrota(frota, nomeFicheiro); break;
            case 8:
                carregaFrota(&frota, nomeFicheiro); break;
            default:
                printf("Digitou valor errado.\n");
        }
    } while(op != 0);
    return 0;
}
//Porto, 10/02/2026
//ESTG
//One.java
//Braima Djaguité
import java.util.Arrays;
public class One{
         public static void main(String[] arg){
           char[] sentence = {'e', 'u', ' ', 's', 'o', 'u', ' ', 'a', 'l', 'u', 'n', 'o', ' ', 'd', 'a', ' ', 'E', 'S', 'T', 'G', '.'};
           for(int i = 0; i < sentence.length; i++){
             System.out.print(sentence[i]);
           }
           System.out.println();

           //Questão 2
           int[][] matriz = new int[3][3];
             matriz[0][0] = 11;
             matriz[0][1] = 7;
             matriz[0][2] = 333;
             matriz[1][0] = -20;
             matriz[1][1] = -23;
             matriz[1][2] = 63;
             matriz[2][0] = -22;
             matriz[2][1] = 501;
             matriz[2][2] = 10000;
             for(int i = 0; i < 3; i++){
                 System.out.println(Arrays.toString(matriz[i]));
             }
             int soma = 0;
             for(int i = 0; i < 3; i++){
                 for(int j = 0; j < 3; j++){
                 soma += matriz[i][j];
                 }
             }
             double media;
             media = soma / 3.0;
             System.out.printf("Soma: %d%nMedia: %f%n", soma, media);

             //Questão 3
             int[] lista = {12, 5, -21, 10, -345, 22, 50, -125, 80, -1};
             float resul = 1.0f;
             for(int i = 0; i < lista.length; i++){
                 resul *= lista[i];
             }
             System.out.println(resul);
             int contar = 0;
             for(int i = 0; i < lista.length; i++){
                 if(lista[i] < 0){
                     contar++;
                 }
             }
             System.out.println(contar);
             int maior = lista[0];
             for(int i = 0; i < lista.length; i++){
                 if(maior < lista[i]){
                     maior = lista[i];
                 }
             }
             System.out.println(maior);

             //Questão 4

             char[] nome = {'A', 'n', 'a', ' ', 'S', 'a', 'n', 't', 'o', 's', '\n'};
             int tamn = 0;
             for(int i = 0; i < nome.length; i++){
                 if(nome[i] == ' '){
                     tamn = i;
                 }
             }
             for(int i = tamn +1; i < nome.length - 1; i++){
                     System.out.print(nome[i]);
             }
             System.out.print(',');
             for(int i = 0; i < tamn; i++){
                 System.out.print(nome[i]);
             }
             int vog = 0;
             for(int i = 0; i < nome.length; i++){
                 if(nome[i] == 'A' || nome[i] == 'a' || nome[i] == 'E' || nome[i] == 'e'){
                   vog++;
                 }
             }
             System.out.println();
             System.out.println(vog);

             //Questão 6
             int[] listaA = {2, -5, -121, 102, -35, -2, 0, -125, 802, -10};
             int[] listaB = {6, 99, -1, 12, 1, -2};
             int[] listaC = new int[listaA.length + listaB.length];
             for(int i = 0; i < listaA.length; i++){
                 listaC[i] = listaA[i];
             }
             for(int i = 0; i < listaB.length; i++){
                 listaC[listaA.length + i] = listaB[i];
             }
             for(int i = 0; i < listaC.length; i++){
             System.out.print(listaC[i] + " ");
             }
             System.out.println();
             int contador = 0;
             for(int i = 0; i < listaC.length; i++){
                 for(int j = i + 1; j < listaC.length; j++){
                     if(listaC[i] == listaC[j]){
                         contador++;
                         break;
                     }
                 }
             }
             System.out.println(contador);

             int tamN = 0;
             for(int i = 0; i < listaA.length; i++){
                 boolean existe = false;
                 for(int j = 0; j < listaB.length; j++){
                     if(listaA[i] == listaB[j]){
                         existe = true;
                         break;
                     }
                 }
                 if(!existe) tamN++;
             }
             int[] listaD = new int[tamN];

             for(int i = 0, k = 0; i < listaA.length; i++){

                 boolean existe = false;
                 for(int j = 0; j < listaB.length; j++){
                     if(listaA[i] == listaB[j]){
                         existe = true;
                         break;
                     }
                 }
                 if(!existe){
                     listaD[k++] = listaA[i];
                 }

             }
             System.out.println(Arrays.toString(listaD));

             int tamM = 0;
             for(int i = 0; i < listaA.length; i++){
                 boolean existe = false;
                 for(int j = 0; j < listaB.length; j++){
                     if(listaA[i] == listaB[j]){
                         existe = true;
                         break;
                     }
                 }
                 if(existe) tamM++;
             }
             int[] listaE = new int[tamM];

             for(int i = 0, k = 0; i < listaA.length; i++){
                 boolean existe = false;
                 for(int j = 0; j < listaB.length; j++){
                     if(listaA[i] == listaB[j]){
                         existe = true;
                         break;
                     }
                 }
                 if(existe) listaE[k++] = listaA[i];
             }
             System.out.println(Arrays.toString(listaE));




         }
        }

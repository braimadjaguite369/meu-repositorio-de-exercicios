//Porto, 12/02/2026
//ESTG
//Matrizes.java
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Matrizes{

    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int N;
        System.out.print("Digite o numero: ");
        N = input.nextInt();

        int[][] matriz = new int[N][N];
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                matriz[i][j] = random.nextInt(100);
                //matriz[i][j] = j + i;

            }
        }

        int[][] nova = new int[N][N];
        for(int i = 0; i < matriz.length; i++){
        System.out.println(Arrays.toString(matriz[i]));
        }
        System.out.println();
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                nova[j][i] = matriz[i][j];
            }
        }
        for(int i = 0; i < nova.length; i++){
        System.out.println(Arrays.toString(nova[i]));
        }
        for(int i = 0; i < matriz.length; i++){
            for(int j = i; j < matriz.length; j++){
                matriz[j][i] = matriz[i][j];
            }
        }
        for(int i = 0; i < nova.length; i++){
            System.out.println(Arrays.toString(nova[i]));
        }

        //Quetsão 2

        int[] vector = {4, 2, 2, 1, 28, 6, 5, 7, 9, 8, 11, 13, 28};
        int primo = 0;
        int perfeito = 0;
        for(int i = 0; i < vector.length; i++){
            boolean temDivisor = false;
            boolean per = false;
            int n = vector[i];
            if(n <= 1){
                continue;
            }
            for(int j = 2; j * j <= n; j++){

                if(n % j == 0){
                    temDivisor = true;
                    break;
                }
            }
            if(!temDivisor){
                primo++;
            }
            int soma = 0;
            for(int k = 1; k <= n/2; k++){
                if(n % k == 0){
                    soma += k;
                }
            }
            if(soma == n){
                perfeito++;
            }
        }
        System.out.println("primo: " + primo + " perfeito:" + perfeito);

        //Questão 3
        int[][] terceiro = {{3, 2, 2}, {3, 12, 10}, {2, 5, 13}, {2, 6, 8}};
        int mais = 0;
        int menor = 0;
        int maisFrequente = 0;
        for(int i = 0; i < terceiro.length; i++){
            for(int j = 0; j < terceiro[i].length; j++){
                int conta = 0;
                for(int k = 0; k < terceiro.length; k++){
                   for(int l = 0; l < terceiro[k].length; l++){
                           if(terceiro[i][j] == terceiro[k][l]){
                            conta++;
                           }
                    }
                }
                if(conta > mais){
                    mais = conta;
                    maisFrequente = terceiro[i][j];
                }

            }

        }
        System.out.println(maisFrequente);
    }
}

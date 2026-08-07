import java.security.SecureRandom;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
 public static void jogar(){
        SecureRandom random = new SecureRandom();
        int escolha = 1 + random.nextInt(200);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual é o teu palpite?");
        int palpite = entrada.nextInt();
        while (palpite != 0){
            if(palpite == escolha){
                System.out.println("ACERTOU!!");
                return;
            }
            if(palpite < escolha){
                System.out.println("Menor! Tente de novo.");
            }
            if(palpite> escolha){
                System.out.println("Maior! Tente de novo.");
            }
            palpite = entrada.nextInt();
        }
    }
    public static void testeLeiDosGrandesNumeros(){
        SecureRandom random = new SecureRandom();
        int[] array = {0, 0, 0, 0, 0, 0};
        for(int i = 0; i < 100000; i++){
            int escolha = 1 + random.nextInt(6);
            switch(escolha){
                case 1: array[0]++;
                break;
                case 2: array[1]++;
                break;
                case 3: array[2]++;
                break;
                case 4: array[3]++;
                break;
                case 5: array[4]++;
                break;
                case 6: array[5]++;
                break;
                default:
                    System.out.println("Um erro inesperado!");
            }

        }
        System.out.println("1: " + array[0] + " 2: " + array[1] + " 3: " + array[2] + " 4: " + array[3] + " 5: " + array[4] + " 6: " + array[5]);
    }
    public static int buscarMenor(int[] lista){
        int menor = lista[0];
        int indice_menor = 0;
        for(int i = 1; i < lista.length; i++){
            if(lista[i] < menor){
                menor = lista[i];
                indice_menor = i;
        
            }
        }

        return indice_menor;
    }
    public static void ordenacaoPorSelecao(int[] lista){
        int[] listaOrdenado = new int[lista.length];
        int tamanho = lista.length;
       for(int i = 0; i < tamanho; i++){
           int indice = buscaMenor(lista);
           int elementoRemovido = lista.remove(indice);
           listaOrdenado.add(elementoRemovido);
       }
       return listaOrdenasdo;
    }
    public static long buscaLinear(long[] lista, long elemento){
        for(int i = 0; i < lista.length; i++){
            if(lista[i] == elemento){
                return i;
            }
        }
        System.out.println("Elemento não encontrado.");
        return -1;
    }
    public static int buscaBinaria(long[] lista, long elemento){
        int menor = 0;
        int maior = lista.length -1;

        while(menor <= maior) {
            int metade = menor + (maior - menor)/2;
            if(elemento == lista[metade]){
                return metade;
            }
            if(lista[metade] < elemento){
                menor = metade + 1;
            }
            if(lista[metade] > elemento){
                maior = metade - 1;
            }
        }
        System.out.println("Elemento não encontrado.");
        return -1;
    }

    public static void main(String[] arg){
        
        long[] lista = new long[100000];
        SecureRandom random = new SecureRandom();
        for(int i = 0; i < lista.length; i++){
            lista[i] = random.nextLong(10000000);
        }
        Arrays.sort(lista);
        System.out.println("Já foi preenchido. ");
        int i = buscaBinaria(lista, lista[50000]);
        System.out.println("O elemento " + lista[i] + " foi encontrado com sucesso, na posiçao " + i +"!");
        
       testeLeiDosGrandesNumeros();
    }
}

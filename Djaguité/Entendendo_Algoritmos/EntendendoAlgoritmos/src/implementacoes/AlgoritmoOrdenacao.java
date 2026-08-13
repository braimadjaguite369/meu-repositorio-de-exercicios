package implementacoes;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class AlgoritmoOrdenacao {
    
    private static final Random random = new Random();

    private int menor(List<Integer> lista){
        int menor = lista.get(0);
        int menor_indice = 0;
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i) < menor){
                menor = lista.get(i);
                menor_indice = i;
            }
        }
        return menor_indice;
    }
    //Tempo de execução O(n^2)
    public List<Integer> SelectSort(List<Integer> lista){
        List<Integer> novaLista = new ArrayList<>();
        int tamanho = lista.size();
        for(int i = 0; i < tamanho; i++){
            int menor_indice = menor(lista);
            novaLista.add(lista.remove(menor_indice));
        }
        return novaLista;
    }
    //Tempo de execução O(n^2), mas tem a vantagem por gastar menos espaço O(1), tempo constante, porque não cria novos arrays.
    public void SelectSortInPlace(int[] array){
        
        for(int i = 0; i < array.length; i++){
            int menor = array[i];
            int menor_indice = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < menor){
                    menor = array[j];
                    menor_indice = j;
                }
            }
            int temp = array[i];
            array[i] = array[menor_indice];
            array[menor_indice] = temp;
        }
    }
    //Tempo de execução O(nlogn), melhor que o O(n^2). Mas cria novos array no processo, aumentando o custo em termos de memória.
    //Tambem pode ocorrer o estouro de pilha de execução
    public List<Integer> quicksort(List<Integer> lista){
        if(lista.size() < 2){
            return lista;
        }
        int indiceMeio = lista.size();
        int pivo = lista.get(indiceMeio);
        List<Integer> menores = new ArrayList<>();
        List<Integer> maiores = new ArrayList<>();
        for(int i = 0; i < lista.size(); i++){
            if(i == indiceMeio){
                continue;
            }
            if(lista.get(i) <= pivo){
                menores.add(lista.get(i));
            } else{
                maiores.add(lista.get(i));
            }

        }
        List<Integer> resultado = new ArrayList<>();
        resultado.addAll(quicksort(menores));
        resultado.add(pivo);
        resultado.addAll(quicksort(maiores));
        return resultado;
    }
    //Também com O(nlogn), só que usa espaço constante O(1), porque usa apenas o array original para ordenar tudo.
    public void quickSortInPlace(List<Integer> lista){
       if(lista == null || lista.size() <= 1){
        return;
       }
       executarQuickSort(lista, 0, lista.size() - 1);
    }
    private void executarQuickSort(List<Integer> lista, int inicio, int fim){
        if(inicio >= fim){
            return;
        }
        int indiceAleatorio = inicio + random.nextInt(fim - inicio + 1);
        Collections.swap(lista, indiceAleatorio, fim);
        int indicePivo = particionar(lista, inicio, fim);
        executarQuickSort(lista, inicio, indicePivo - 1);
        executarQuickSort(lista, indicePivo + 1, fim);
    }
    private int particionar(List<Integer> lista, int inicio, int fim){
        int i = inicio - 1;
        int pivo = lista.get(fim);
        for(int j = inicio; j < fim; j++){
            if(lista.get(j) < pivo){
                i++;
                Collections.swap(lista, i, j);
            }
        }
        Collections.swap(lista, i + 1, fim);
        
        return i + 1;
    }

    public List<Integer> bubbleSort(List<Integer> lista){
        for(int i = 0; i < lista.size() - 1; i++){
            boolean troca = false;
            for(int j = 0; j < lista.size() - 1 - i; j++){
                if(lista.get(j) > lista.get(j+1)){
                    int temp = lista.get(j);
                    lista.set(j, lista.get(j+1));
                    lista.set(j+1, temp);
                    //Pode usar tambem o Collectins.saws(lista, j, j+1) para trocar,
                    troca = true;
                }
            }
            if(!troca){
                break;
            }
        }
        return lista;
    }

}

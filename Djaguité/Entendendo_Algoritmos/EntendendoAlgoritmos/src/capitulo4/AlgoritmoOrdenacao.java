package capitulo4;
import java.util.ArrayList;
import java.util.List;

public class AlgoritmoOrdenacao {

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
    public List<Integer> Selecao(List<Integer> lista){
        List<Integer> novaLista = new ArrayList<>();
        int tamanho = lista.size();
        for(int i = 0; i < tamanho; i++){
            int menor_indice = menor(lista);
            novaLista.add(lista.remove(menor_indice));
        }
        return novaLista;
    }
    public int[] inPlace(int[] array){
        
        for(int i = 0; i < array.length; i++){
            int menor = array[0];
            int menor_indice = i;
            for(int j = i; j < array.length; j++){
                if(array[j] < menor){
                    menor = array[j];
                    menor_indice = j;
                }
            }
            int temp = array[i];
            array[i] = array[menor_indice];
            array[menor_indice] = temp;
        }
        return array;
    }

    public List<> quicksort(List<Integer> lista){
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

    public List<Integer> bubbleSort(List<Integer> lista){
        for(int i = 0; i < lista.size() - 1; i++){
            boolean troca = false;
            for(int j = 0; j < lista.size() - 1 - i; j++){
                if(lista.get(j) > lista.get(j+1)){
                    int temp = lista.get(j);
                    lista.set(j, lista.get(j+1));
                    lista.set(j+1, temp);
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

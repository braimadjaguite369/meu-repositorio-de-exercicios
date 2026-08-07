package capitulo4;

public class AlgoritmoPesquisa {

    public int Binaria(int[] lista, int item){
        int alto = lista.length -1;
        int baixo = 0;

        while (baixo <= alto) {
            int meio = baixo + (alto - baixo)/2; // para evitar estouro de memoria, porque o int tem limite de 2.147.483.647, então evita a soma de baixo com alto que pode vir a ser bem grande.
            int palpite = lista[meio];
            
            if(palpite == item){
                return meio;
            }
            if(palpite < item){
                baixo = meio + 1;
            } else{
                alto = meio - 1;
            }
            
        }
        return -1;
    }

    public int Sequencial(int[] lista, int item){
        for(int i = 0; i < lista.length; i++){
            if(lista[i] == item){
                return i;
            }
        }
        return -1;
    }
    public int SequencialOrdenado(int[] lista, int item){
        for(int i = 0; i < lista.length; i++){
            if(lista[i] == item){
                return i;
            }
            if(lista[i] > item){
                return -1;
            }
        }
        return - 1;
    }

}

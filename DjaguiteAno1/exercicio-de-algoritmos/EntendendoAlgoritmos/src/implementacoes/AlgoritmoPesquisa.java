package implementacoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class AlgoritmoPesquisa {
    static final int INFINITO = Integer.MAX_VALUE;

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
        return -1;
    }

    public static boolean pesquisaEmLargura(Map<String, List<String>> grafo, String inicio){
        //Fila para gerir a ordem de busca, o primeiro a ser adicionado será o primeiro a ser analisado.
        Queue<String> filaDeBusca = new LinkedList<>();
        //Um array para registar quem já foi verificado, evitando repetições e um possível loop infinito.
        List<String> verificados = new ArrayList<>();
        //Para conferir se o vértice "inicio" realmente faz parte do grafo e, se sim, adicionar os vizinhos dele.
        if(grafo.containsKey(inicio)){
            filaDeBusca.addAll(grafo.get(inicio));
        }
        
        while (!filaDeBusca.isEmpty()) {
            String pessoa = filaDeBusca.poll();
            if(!verificados.contains(pessoa)){
                if(e_vendedor_de_manga(pessoa)){
                    System.out.println(pessoa + " e um vendedor de manga!!");
                    return true;
                } else{
                    //Esta é uma outra forma de garantir o funcionamento correto mesmo a "pessoa" não sendo uma chave.
                    //Poderia usar o if como foi feito antes de adicionar os valores do "inicio", mas esta é a mais elegante e menos poluída.
                    filaDeBusca.addAll(grafo.getOrDefault(pessoa, new ArrayList<>()));
                    verificados.add(pessoa);
                }
                
            }
        }
        System.out.println("Nenhum vendedor de manga foi encontrado!");
        return false;
    }
    //A condição usada aqui foi a do livro Entendendo Algoritmos. Se o nome termina em "m" então é vendedor...
    private static boolean e_vendedor_de_manga(String nome){
        return nome.endsWith("m");
    }

    
   //Agora crio um método de pesquisa pelo Djikstra, que poode ser chamado por classes externas.
   public static void pesquisaDjikstra(Map<String, Map<String, Integer>> grafo, String inicio, String fim){
        Map<String, Integer> custos = new HashMap<>();
        Map<String, String> pais = new HashMap<>();
        List<String> processasos = new ArrayList<>();
        //inicializar mapa de custos
        for(String no : grafo.keySet()){
            custos.put(no, INFINITO);
        }
        custos.put(inicio, 0);

        for(String no : grafo.keySet()){
            pais.put(no, null);
        }
        //"no" e "vertice" são sinónimos, só usei os dois para diferenciar e não criar confusão.
        String vertice = encontrarNoMaisBarato(custos, processasos);

        while (vertice != null) {
            //um interruptor que termina o loop quando o vertice mais barato é o último. Do contrário, definiria o custo mais barato para todos os vertices.
            if(vertice.equals(fim)){
                break;
            }
            int custoAtual = custos.get(vertice);
            Map<String, Integer> vizinhos =  grafo.getOrDefault(vertice, new HashMap<>());;
            for(String vizinho : vizinhos.keySet()){
                int novoCusto = custoAtual + vizinhos.get(vizinho);
                if(novoCusto < custos.getOrDefault(vizinho, INFINITO)){
                    custos.put(vizinho, novoCusto);
                    pais.put(vizinho, vertice);
                }
            }
            
            processasos.add(vertice);
            vertice = encontrarNoMaisBarato(custos, processasos);
        }
        imprimirCaminhoMinimo(pais, inicio, fim);
        System.out.println("Com custo: " + custos.getOrDefault(fim, 0));
   }

    private static String encontrarNoMaisBarato(Map<String, Integer> custos, List<String> processados){
        String noMaisBarato = null;
        Integer menorCusto = INFINITO;
        for(String no : custos.keySet()){
            if(custos.get(no) < menorCusto && !processados.contains(no)){
                menorCusto = custos.get(no);
                noMaisBarato = no;      
            }
        }
        return noMaisBarato;
    }
    private static void imprimirCaminhoMinimo(Map<String, String> pais, String inicio, String fim){
        List<String> caiminhoMaisCurto = new ArrayList<>();
        caiminhoMaisCurto.add(fim);
        String pai = pais.get("fim");
        while(pai != null){
            caiminhoMaisCurto.add(pai);
            pai = pais.get(pai);
        }
        Collections.reverse(caiminhoMaisCurto);
        if(caiminhoMaisCurto.get(0).equals(inicio)){
            System.out.println("Caminho minimo encontrado: " + caiminhoMaisCurto.toString());
        } else{
            System.out.println("Nao existe caminho valido entre os vertices especificados.");
        }
    }


    //Este método "main" foi criado apenas para testar o algoritmo de Djikstra e criar exemplo de grafos de ponderados e não ponderados.
    public static void main(String[] arg){

        Map<String, List<String>> grafoNaoPonderado = new HashMap<>();
        grafoNaoPonderado.put("inicio", new ArrayList<>());
        grafoNaoPonderado.get("inicio").addAll(List.of("A", "B"));
        grafoNaoPonderado.put("A", new ArrayList<>());
        grafoNaoPonderado.get("A").add("fim");
        grafoNaoPonderado.put("B", new ArrayList<>());
        grafoNaoPonderado.get("B").addAll(List.of("A", "fim"));
        grafoNaoPonderado.put("fim", new ArrayList<>());

        Map<String, Map<String, Integer>> grafo = new HashMap<>();
        grafo.put("inicio", new HashMap<>());
        grafo.get("inicio").put("A", 6);
        grafo.get("inicio").put("B", 2);

        grafo.put("A", new HashMap<>());
        grafo.get("A").put("fim", 1);

        grafo.put("B", new HashMap<>());
        grafo.get("B").put("A", 3);
        grafo.get("B").put("fim", 5);

        grafo.put("fim", new HashMap<>());
        pesquisaDjikstra(grafo, "inicio", "fim");

       /*  Map<String, Integer> custos = new HashMap<>();
        custos.put("A", 6);
        custos.put("B", 2);
        custos.put("fim", INFINITO);

        Map<String, String> pais = new HashMap<>();
        pais.put("A", "inicio");
        pais.put("B", "inicio");
        pais.put("fim", null);

        List<String> processados = new ArrayList<>();

        String no = encontrarNoMaisBarato(custos, processados);
        while(no != null){
            int custoAtual = custos.get(no);
            Map<String, Integer> vizinhos = grafo.get(no);
            for(String vizinho : vizinhos.keySet()){
                int novoCusto = custoAtual + vizinhos.get(vizinho);
                if(novoCusto < custos.getOrDefault(vizinho, INFINITO)){
                    custos.put(vizinho, novoCusto);
                    pais.put(vizinho, no);
                }
            }
            processados.add(no);
            no = encontrarNoMaisBarato(custos, processados);
        }
    
        imprimirCaminhoMinimo(pais, "inicio", "fim");
        System.out.println("O custo minimo e: " + custos.get("fim"));*/

    }

    

}

package implementacoes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapClass {
   
   public static void verificar_eleitor(Map<String, Boolean> votos, String nome){
      if(votos.get(nome) != null){
         System.out.println("O " + "eleitor " + nome + " já votou antes. Nao pode votar de novo.");
      } else{
         votos.put(nome, true);
         System.out.println("O " + "eleitor " + nome + " pode votar.");
      }
   }


   public static int[] duasSomas(int[] numeros, int alvo){

     Map<Integer, Integer> mapComplementos = new HashMap<>();
     for(int i = 0; i < numeros.length; i++){
        int complemento = alvo - numeros[i];
        if(mapComplementos.containsKey(complemento)){
           return new int[] { mapComplementos.get(complemento), i};
        }
        mapComplementos.put(numeros[i], i);
     }

     return new int[] {};
   }
   //Um método que cria um grafo com vértices e arestas definidos dentro do próprio método. É apenas para um exemplo.
   public static void criarGrafoAmigos(){
      Map<String, List<String>> grafo = new HashMap<>();
      grafo.put("Eu", new ArrayList<>());
      grafo.put("Sorri", new ArrayList<>());
      grafo.put("Amade", new ArrayList<>());
      grafo.put("Natalia", new ArrayList<>());
      grafo.put("Finoro", new ArrayList<>());
      grafo.put("Kleva", new ArrayList<>());

      grafo.get("Eu").addAll(List.of("Sorri", "Amade", "Natalia", "Finoro", "Kleva"));
      grafo.get("Sorri").addAll(List.of("Eu", "Finoro", "Kleva"));
      grafo.get("Amade").addAll(List.of("Eu", "Natalia"));
      grafo.get("Natalia").addAll(List.of("Eu", "Amade"));
      grafo.get("Finoro").addAll(List.of("Eu", "Sorri", "Kleva"));
      grafo.get("Kleva").addAll(List.of("Eu", "Sorri", "Finoro"));
      //Apresentar os dados do grafo.
      System.out.println("Os meus vizinhos: " + grafo.get("Eu"));
      System.out.println("Os vizinhos do Amade: " + grafo.get("Amade"));

   }
}

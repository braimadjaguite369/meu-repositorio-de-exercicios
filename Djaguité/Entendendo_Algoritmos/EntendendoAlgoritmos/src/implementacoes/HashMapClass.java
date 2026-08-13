package implementacoes;
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
}

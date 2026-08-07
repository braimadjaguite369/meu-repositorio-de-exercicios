//23/02/2026
//Braima Djaguité
//Engenharia informatica exercicio PP
//ESTG
package pp_fp05;

public class Main{
  public static void main(String[] arg){
    User u1 = new User("Djaguite", "braimadjaguite@", "2004-12-19");
    User u2 = new User("Braima", "djaguite@12", "2007-15-19");
    u1.adicionarDespesa("Alimentacao", 100, "2026-01-02", 1); //= new Express("Alimentacao", 100, "2026-01-02");
    u1.adicionarDespesa("Outro", 123, "2026-01-03", 2); // new Express("Outro", 123, "2026-01-03");

    u2.despesas[0] = new Express("Carro", 532, "2026-03-06");
    u2.despesas[1] = new Express("Alimentacao", 200, "2026-03-07");

    u1.detalhes(2);
    u2.detalhes(2);


  }
}
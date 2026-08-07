//27/02/2026
//Braima Djaguite
//Engenharia Informatica
//ESTG

import java.sql.SQLOutput;

public class Main{
     public static void main(String[] arg){

          Aluno aluno = new Aluno("Djaguité", 20, "M", "Computaçao");
          Professor prof = new Professor("FO", 30, "M", "Fisico", 1000);
          Funcionario func = new Funcionario("Sorry", 24, "M", "Saude");
          aluno.mostrar();
          prof.mostrar();
          func.mostrar();

     }
}
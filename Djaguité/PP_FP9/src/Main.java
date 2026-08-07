//30/03/2026
//BRAIMA DJAGUITÉ
//Engenharia informática
//ESTG

import Enums.Habilitacoes;
import Enums.TipoContrato;
import Enums.TipoProgramador;

public class Main{
    public static void main(String[] arg){
        Projecto[] projecto = new Projecto[20];
        projecto[0] = new Projecto("Sistema de Banco");
        projecto[1] = new Projecto("Sistema de gestão de funcionários");

        GestorDeProjeto gestor = new GestorDeProjeto("Braima", "19/12/2004","Porto",
                1234, 1000, 50000, 123, "2026-03-30");

        Programador programador = new Programador("Djaguité", "2004-12-19", "Gabu", 132, 2345, 70000,
                12, 6, "Sistema para gerir dados de alunos", TipoProgramador.SENIOR);

        Administrador administrador = new Administrador("Amade", "2003-12-12", "Bissau", 345, 32,
                50000, "AD", TipoContrato.INTEGRAL, Habilitacoes.DOUTORAMENTO, "2024-11-03", "2028-02-12", 0.2);

        gestor.addProjecto(projecto[0]);
        gestor.addProjecto(projecto[1]);
        ProgrammingManagement programmingManagement = new ProgrammingManagement();
        programmingManagement.addFuncionario(programador);
        programmingManagement.addFuncionario(administrador);
        programmingManagement.addFuncionario(gestor);
        programmingManagement.listarFunfionarios();
        programmingManagement.listarGestores();
        programmingManagement.remFuncionario(2);
        programmingManagement.listarFunfionarios();
    }
}
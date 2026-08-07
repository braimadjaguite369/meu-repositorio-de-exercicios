public class Main {
    public static void main(String[] arg){
        Visitante visita = new Visitante("AMADE", 23, "M");
        Aluno aluno = new Aluno("Djaguite", 20, "M", 2, "Computacao");
        Bolsista bol = new Bolsista("Sorry", 24, "M", 21, "Medicina", 3);
        Tecnico tec = new Tecnico("Sorry", 24, "M", 25, "Mecanica");
        aluno.pagarMensal();
        bol.pagarMensal();
        tec.pagarMensal();
        System.out.println(visita.toString());
    }
}

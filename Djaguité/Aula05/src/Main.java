//17/02/2026
//Braima Djaguité
//Programa para criar conta bancária
//ESTG

public class Main{
    public void main() {
        ContaBanco conta1 = new ContaBanco();

        conta1.setNumeroConta(666);
        conta1.abrirConta("CC", "Djarai Jaló");

        ContaBanco conta2 = new ContaBanco();
        conta2.setNumeroConta(333);
        conta2.abrirConta("CP", "Djaguite");
        conta1.depositarSaldo(100);
        conta2.depositarSaldo(500);
        conta1.sacarDinheiro(150);
        conta1.fecharConta();
        conta2.sacarDinheiro(1000);
        conta1.statoAtual();
        conta2.statoAtual();

    }

}

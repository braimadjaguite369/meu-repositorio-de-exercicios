public class Main {

    public static void main(String[] arg){
        EstacaoGas[] estacaoGases = new EstacaoGas[2];
        EstacaoGas est = new EstacaoGas("Djaguite", 1, 2);
        EstacaoGas est1 = new EstacaoGas("Djaguite", 1, 3);
        System.out.println("Preço total " + est.getTotalGasPrice(3));
        estacaoGases[0] = est;
        estacaoGases[1] = est1;

    }
}
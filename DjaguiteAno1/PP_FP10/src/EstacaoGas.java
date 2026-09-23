public class EstacaoGas extends Companhia implements ServicoGas {
    private double price;

    public EstacaoGas(String nome, int numCont, double price) {
        super(nome, numCont);
        this.setGasPrice(price);
    }

    @Override
    public double getGasPreco() {
        return this.price;
    }

    @Override
    public void setGasPrice(double preco) {
         if(preco <= 0){
             throw new IllegalArgumentException ("Preço deve ser superior a zero.");
         }
         this.price = preco;
    }

    @Override
    public double getTotalGasPrice(double litro) {
        return litro*getGasPreco();
    }
}

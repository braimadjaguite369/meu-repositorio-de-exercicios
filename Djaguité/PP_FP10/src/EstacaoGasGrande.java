public class EstacaoGasGrande extends EstacaoGas implements ServicosCafetaria {
    private double coffeePrice;
    public EstacaoGasGrande(String nome, int numCont, double priceGasol, double priceCoffee) {
        super(nome, numCont, priceGasol);
        this.setCoffeePrice(priceCoffee);
    }

    @Override
    public double getCoffeePrice() {
        return this.coffeePrice;
    }

    @Override
    public void setCoffeePrice(double preco) {
        if(preco <= 0){
            throw new IllegalArgumentException("Só são permitidos valores acima de zero.");
        }
        this.coffeePrice = preco;
    }

    @Override
    public double getTotalCoffeePrice(double coffees) {
        return coffees*this.getCoffeePrice();
    }
}

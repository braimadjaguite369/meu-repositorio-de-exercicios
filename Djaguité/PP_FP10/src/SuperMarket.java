
public class SuperMarket extends  Companhia implements MarketService{
    private double potetoPrice;

    public SuperMarket(String nome, int numCont, double potetoPrice) {
        super(nome, numCont);
        this.setPotetoPrice(potetoPrice);
    }


    @Override
    public double getPotetoPrice() {
        return this.potetoPrice;
    }

    @Override
    public void setPotetoPrice(double potetoPrice) {
        if(potetoPrice <= 0){
            throw new IllegalArgumentException("O valor precisa ser superior a 0.");
        }
        this.potetoPrice = potetoPrice;
    }

    @Override
    public double getTotalPotetoPrice(double kilos) {
        return kilos*this.getPotetoPrice();
    }
}

public abstract class HiperMarket extends EstacaoGasGrande implements HiperMarketService {
    private double taxaAnual;
    private double potetoPrice;

    public HiperMarket(String nome, int numCont, double priceGasol, double priceCoffee, int taxaAnual, double potetoPrice) {
        super(nome, numCont, priceGasol, priceCoffee);
        this.setTaxaJuroAnual(taxaAnual);
        this.setPotetoPrice(potetoPrice);
    }

    public abstract int getPontos(double valorCompra);

    @Override
    public double getTaxaJuroAnual() {
        return this.taxaAnual;
    }

    @Override
    public void setTaxaJuroAnual(double taxa) {
           if(taxa <= 0){
               throw new IllegalArgumentException("Taxa tem de ser superior a zero.");
           }
           this.taxaAnual = taxa;
    }

    @Override
    public double prestacaMensalAPagar(double montante, int meses) {
        double taxaJuroMensal = Math.pow(1 + getTaxaJuroAnual(), 1.0/12.0) - 1;
        double prestacaoMensal = (taxaJuroMensal * montante) / (1 - Math.pow(1 + taxaJuroMensal, -meses));
        return prestacaoMensal;
    }

    @Override
    public double getPotetoPrice() {
        return this.potetoPrice;
    }

    @Override
    public void setPotetoPrice(double potetoPrice) {
          if(potetoPrice <= 0){
              throw new IllegalArgumentException("O preço tem de ser superior a zero.");
          }
          this.potetoPrice = potetoPrice;
    }

    @Override
    public double getTotalPotetoPrice(double kilos) {
        return kilos*getPotetoPrice();
    }
}

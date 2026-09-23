import java.time.LocalDate;

public class ContinentHiperMarket extends HiperMarket {
    public ContinentHiperMarket(String nome, int numCont, double priceGasol, double priceCoffee, int taxaAnual, double potetoPrice) {
        super(nome, numCont, priceGasol, priceCoffee, taxaAnual, potetoPrice);
    }

    @Override
    public int getPontos(double valorCompra) {
        LocalDate hoje = LocalDate.now();
        if(hoje.getDayOfMonth() <= 20){
            return (int)(valorCompra/5);
        }
        return (int)(valorCompra/20) * 3;
    }
}

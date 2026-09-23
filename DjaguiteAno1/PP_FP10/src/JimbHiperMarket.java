import java.time.DayOfWeek;
import java.time.LocalDate;

public class JimbHiperMarket extends HiperMarket {

    public JimbHiperMarket(String nome, int numCont, double priceGasol, double priceCoffee, int taxaAnual, double potetoPrice) {
        super(nome, numCont, priceGasol, priceCoffee, taxaAnual, potetoPrice);
    }

    @Override
    public int getPontos(double valorCompra) {
        LocalDate hoje = LocalDate.now();
        DayOfWeek dia = hoje.getDayOfWeek();
        int ponto;
        if(dia != DayOfWeek.SATURDAY && dia != DayOfWeek.SUNDAY){
            ponto = (int)(valorCompra/10.0) * 3;
        return ponto;
        }
        ponto = (int)(valorCompra/10.0);
        return ponto;
    }
}

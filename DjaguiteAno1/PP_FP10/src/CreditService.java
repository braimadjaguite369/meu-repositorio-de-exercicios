public interface CreditService {
    public double getTaxaJuroAnual();
    public void setTaxaJuroAnual(double taxa);
    public double prestacaMensalAPagar(double montante, int meses);
}

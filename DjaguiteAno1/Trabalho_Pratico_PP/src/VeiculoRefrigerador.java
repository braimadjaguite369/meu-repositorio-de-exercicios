public class VeiculoRefrigerador extends MeuVeiculo {
    private double maxKmComCarga;

    public VeiculoRefrigerador(int capacidadeMax, double maxKmComCarga) {
        super(capacidadeMax);
        this.setMaxKmComCarga(maxKmComCarga);
    }

    public double getMaxKmComCarga() {
        return maxKmComCarga;
    }

    public void setMaxKmComCarga(double maxKmComCarga) {
        if(maxKmComCarga <= 0){
            System.out.println("Valor de máximo de kg permitido inválido!");
            return;
        }
        this.maxKmComCarga = maxKmComCarga;
    }
}

import Enums.Condicao;
import Enums.Origem;

public class Motociclo extends Veiculo {
    private int cilindrada;
    private double diametroDeRodas; //diametro de rodas

    public Motociclo(int numChassis, String marca, String modelo, String dataFabric, Origem origem,
                     int numKm, Condicao condicao, double preco, int cilindrada, double diametroDeRodas) {
        super(numChassis, marca, modelo, dataFabric, origem, numKm, condicao, preco);
        this.cilindrada = cilindrada;
        this.diametroDeRodas = diametroDeRodas;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public double getDiametroDeRodas() {
        return diametroDeRodas;
    }

    @Override
    public double calcPreco(){
          return getPreco();
    }

    @Override
    public String toString() {
        return "Motociclo{" + super.toString() +
                "cilindrada = " + cilindrada + ", diametroDeRodas=" + diametroDeRodas;
    }
}

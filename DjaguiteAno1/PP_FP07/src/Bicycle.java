import Enums.Cor;

public class Bicycle {
    private static int proxId = 1;
    private int id;
    private double numVelocidade;
    private Cor cor;
    private double diametro;
    private String tipoTravao;
    private String matConstrucao;
    private double preco;
    private int anosGarantia;

    public Bicycle(double numVelocidade, Cor cor, double diametro,
                   String tipoTravao, String matConstrucao, double preco, int anosGarantia) {
        this.id = proxId++;
        this.numVelocidade = numVelocidade;
        this.cor = cor;
        this.diametro = diametro;
        this.tipoTravao = tipoTravao;
        this.matConstrucao = matConstrucao;
        this.preco = preco;
        this.anosGarantia = anosGarantia;
    }

    public Bicycle(double numVelocidade, Cor cor, double diametro, double preco, int anosGarantia) {
        this.id = proxId++;
        this.numVelocidade = numVelocidade;
        this.cor = cor;
        this.diametro = diametro;
        this.tipoTravao = "Travoes Hidraulicas";
        this.matConstrucao = "Carbono";
        this.preco = preco;
        this.anosGarantia = anosGarantia;
    }

    public int getId() {
        return id;
    }

    public double getNumVelocidade() {
        return numVelocidade;
    }

    public String getCor() {
        return cor;
    }

    public double getDiametro() {
        return diametro;
    }

    public String getTipoTravao() {
        return tipoTravao;
    }

    public String getMatConstrucao() {
        return matConstrucao;
    }

    public double getPreco() {
        return preco;
    }

    public int getAnosGarantia() {
        return anosGarantia;
    }
}

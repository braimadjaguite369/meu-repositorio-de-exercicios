import java.util.Date;

public abstract class Funcionario {
    private String name;
    private String data;
    private String morada;
    private int numCartao;
    private int numIdFiscal;
    private double salarioBase;

    public Funcionario(String name, String data, String morada, int numCartao, int numIdFiscal, double salarioBase) {
        this.name = name;
        this.data = data;
        this.morada = morada;
        this.numCartao = numCartao;
        this.numIdFiscal = numIdFiscal;
        this.salarioBase = salarioBase;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public int getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(int numCartao) {
        this.numCartao = numCartao;
    }

    public int getNumIdFiscal() {
        return numIdFiscal;
    }


    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract double calcSalario();
    public abstract void apresentar();

}

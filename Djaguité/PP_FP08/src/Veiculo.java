import Enums.Condicao;
import Enums.Origem;

import java.time.LocalDate;


public abstract class Veiculo {
    private static int proxId = 1;
    private int id;
    private int numChassis;
    private String marca;
    private String modelo;
    private LocalDate dataFabric;
    private Origem origem;
    private int numKm;
    private Condicao condicao;
    private double preco;

    public Veiculo(int numChassis, String marca, String modelo, String dataFabric,
                   Origem origem, int numKm, Condicao condicao, double preco) {
        this.id = proxId++;
        this.numChassis = numChassis;
        this.marca = marca;
        this.modelo = modelo;
        this.dataFabric = LocalDate.parse(dataFabric);
        this.origem = origem;
        this.numKm = numKm;
        this.condicao = condicao;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public int getNumChassis() {
        return numChassis;
    }

    public void setNumChassis(int numChassis) {
        this.numChassis = numChassis;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public LocalDate getDataFabric() {
        return dataFabric;
    }

    public Origem getOrigem() {
        return origem;
    }

    public void setOrigem(Origem origem) {
        this.origem = origem;
    }

    public int getNumKm() {
        return numKm;
    }

    public void setNumKm(int numKm) {
        this.numKm = numKm;
    }

    public Condicao getCondicao() {
        return condicao;
    }

    public void setCondicao(Condicao condicao) {
        this.condicao = condicao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public abstract double calcPreco();
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || !(obj instanceof  Veiculo)){ //this.getClass() != obj.getClass()){
            return false;
        }
        Veiculo veiculo = (Veiculo) obj;
        return this.numChassis == veiculo.numChassis;
    }

    @Override
    public String toString() {
        return "ID=" + id + ", numChassis= " + numChassis + ", marca= '" + marca + '\'' + ", modelo= '" + modelo + '\'' +
                ", dataFabric = " + dataFabric +  ", origem = " + this.origem + ", numKm = " + numKm + ", condicao = " + condicao +  ", preco = " + preco;
    }
}

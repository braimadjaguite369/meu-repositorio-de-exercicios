import Enums.TipoProgramador;

import java.util.logging.StreamHandler;

public class Programador extends Funcionario {
    private int codigoFuncionario;
    private int numAnosDeProgramacao;
    private String nomeProjecto;
    private TipoProgramador tipoProgramador;

    public Programador(String name, String data, String morada, int numCartao, int numIdFiscal, double salarioBase, int codigoFuncionario,
                       int numAnosDeProgramacao, String nomeProjecto, TipoProgramador tipoProgramador) {
        super(name, data, morada, numCartao, numIdFiscal, salarioBase);
        this.codigoFuncionario = codigoFuncionario;
        this.numAnosDeProgramacao = numAnosDeProgramacao;
        this.nomeProjecto = nomeProjecto;
        this.tipoProgramador = tipoProgramador;
    }

    private int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    private void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    private int getNumAnosDeProgramacao() {
        return numAnosDeProgramacao;
    }

    private void setNumAnosDeProgramacao(int numAnosDeProgramacao) {
        this.numAnosDeProgramacao = numAnosDeProgramacao;
    }

    private String getNomeProjecto() {
        return nomeProjecto;
    }

    private void setNomeProjecto(String nomeProjecto) {
        this.nomeProjecto = nomeProjecto;
    }

    private TipoProgramador getTipoProgramador() {
        return tipoProgramador;
    }

    private void setTipoProgramador(TipoProgramador tipoProgramador) {
        this.tipoProgramador = tipoProgramador;
    }
    @Override
    public double calcSalario(){
        int numAno = this.getNumAnosDeProgramacao();
        double salario = (getSalarioBase() * 1.05);
        if(this.getTipoProgramador() == TipoProgramador.JUNIOR){
            return (((salario) + ((0.05) * (salario))) + ((0.005) * (salario) * numAno));
        }
        if(this.getTipoProgramador() == TipoProgramador.SENIOR){
            return ((salario) + ((0.1) * (salario))) + ((0.005) * (salario) * (numAno));
        }
        return 0;
    }
    @Override
    public void apresentar(){
        System.out.println("Nome: " + getName());
        System.out.println("Data: " + getData());
        System.out.println("Morada: " + getMorada());
        System.out.println("Numero de cartão: " + getNumCartao());
        System.out.println("Numero fiscal: " + getNumIdFiscal());
        System.out.println("Salário Base: " + getSalarioBase());
        System.out.println("Código de funcionário: " + getCodigoFuncionario());
        System.out.println("Numero de anos como programador: " + getNumAnosDeProgramacao());
        System.out.println("Nome do projecto em que está a trabalhar: " + getNomeProjecto());
        System.out.println("Tipo de programador: " + TipoProgramador.tipoProgramadorParaString(getTipoProgramador()));
        System.out.println("Salário bruto: " + this.calcSalario());

    }
}

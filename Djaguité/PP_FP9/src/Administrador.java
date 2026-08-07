import Enums.Habilitacoes;
import Enums.TipoContrato;

import java.time.LocalDate;

public class Administrador extends Funcionario {
    private String sigla;
    private TipoContrato tipoContrato;
    private Habilitacoes habilitacoes;
    private LocalDate dataContratacao;
    private LocalDate dataFimContrato;
    private double percentContrato;

    public Administrador(String name, String data, String morada, int numCartao, int numIdFiscal, double salarioBase, String sigla,
                         TipoContrato tipoContrato, Habilitacoes habilitacoes, String dataContratacao, String dataFimContrato, double percentContrato) {
        super(name, data, morada, numCartao, numIdFiscal, salarioBase);
        this.sigla = sigla;
        this.tipoContrato = tipoContrato;
        this.habilitacoes = habilitacoes;
        this.dataContratacao = LocalDate.parse(dataContratacao);
        this.dataFimContrato = LocalDate.parse(dataFimContrato);
        this.percentContrato = percentContrato;
    }

    public Administrador(String name, String data, String morada, int numCartao, int numIdFiscal, double salarioBase, String sigla,
                         TipoContrato tipoContrato, Habilitacoes habilitacoes, String dataContratacao, double percentContrato) {
        super(name, data, morada, numCartao, numIdFiscal, salarioBase);
        this.sigla = sigla;
        this.tipoContrato = tipoContrato;
        this.habilitacoes = habilitacoes;
        this.dataContratacao = LocalDate.parse(dataContratacao);
        this.percentContrato = percentContrato;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public Habilitacoes getHabilitacoes() {
        return habilitacoes;
    }

    public void setHabilitacoes(Habilitacoes habilitacoes) {
        this.habilitacoes = habilitacoes;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public LocalDate getDataFimContrato() {
        return dataFimContrato;
    }

    public void setDataFimContrato(LocalDate dataFimContrato) {
        this.dataFimContrato = dataFimContrato;
    }

    public double getPercentContrato() {
        return percentContrato;
    }

    public void setPercentContrato(double percentContrato) {
        this.percentContrato = percentContrato;
    }

    @Override
    public double calcSalario(){
         double salario = (this.getSalarioBase()) * (this.getPercentContrato());
         if(this.getHabilitacoes() == Habilitacoes.LICENCIATURA){
             return ((salario) + ((0.1) * (salario)));
         }
         if(this.getHabilitacoes() == Habilitacoes.MESTRADO){
             return ((salario) + ((0.2) * (salario)));
         }
         if(this.getHabilitacoes() == Habilitacoes.DOUTORAMENTO){
              return ((salario) + ((0.3) * (salario)));
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
        System.out.println("Sigla: " + getSigla());
        System.out.println("Tipo de contrato: " + TipoContrato.tipoContratoParaString(getTipoContrato()));
        System.out.println("Habilitação: " + Habilitacoes.habilitacaoParaString(getHabilitacoes()));
        System.out.println("Data de contratação: " + getDataContratacao().toString());
        if(getDataFimContrato() != null){
        System.out.println("Data de fim de contrato: " + getDataFimContrato().toString());
        }
        System.out.println("Percentagem sobre o salario base acordado na contratação: " + getPercentContrato());
    }
}

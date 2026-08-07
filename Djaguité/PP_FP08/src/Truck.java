import Enums.Condicao;
import Enums.Origem;
import Enums.Tipologia;
import triler.Triler;

public class Truck extends Veiculo {
    private double comprimento;
    private double cargaUtil;
    private Tipologia tipologia;
    private Triler triler;

    public Truck(int numChassis, String marca, String modelo, String dataFabric, Origem origem, int numKm, Condicao condicao, double preco,
                 double comprimento, double cargaUtil, Tipologia tipologia, Triler triler) {
        super(numChassis, marca, modelo, dataFabric, origem, numKm, condicao, preco);
        this.comprimento = comprimento;
        this.cargaUtil = cargaUtil;
        this.tipologia = tipologia;
        this.triler = triler;
    }
    public Truck(int numChassis, String marca, String modelo, String dataFabric, Origem origem, int numKm, Condicao condicao, double preco,
                 double comprimento, double cargaUtil, Tipologia tipologia) {
        super(numChassis, marca, modelo, dataFabric, origem, numKm, condicao, preco);
        this.comprimento = comprimento;
        this.cargaUtil = cargaUtil;
        this.tipologia = tipologia;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getCargaUtil() {
        return cargaUtil;
    }

    public Tipologia getTipologia() {
        return tipologia;
    }

    public Triler getTriler() {
        return triler;
    }

    public void setTriler(Triler triler) {
        this.triler = triler;
    }

    @Override
    public double calcPreco(){
        if(this.triler != null && this.getCondicao() == Condicao.NEW){
           return (this.getPreco() - (0.05*this.getPreco()));
        }
        if(this.triler == null && this.getCondicao() == Condicao.NEW){
            return this.getPreco();
        }
        return (this.getPreco() - (0.15*this.getPreco()));
    }
    public void eliminarTriler(){
          this.setTriler(null);
    }
    public void addTriler(Triler triler){
           this.setTriler(triler);
    }

    @Override
    public String toString() {
        return "Truck: " + super.toString() +
                "comprimento = " + comprimento + ", cargaUtil = " + cargaUtil + ", tipologia= " + Tipologia.tipologiaParaString(tipologia) +
                ", triler= " + (triler != null ? triler.toString() : "Sem triler");
    }
}

import com.estg.core.AidBox;

public class Destino {
    private AidBox aidBox;
    private double distancia;
    private double duracao;

    public Destino(String nome, double distancia, double duracao) {
        this.setNomeDestino(nome);
        this.setDistancia(distancia);
        this.setDuracao(duracao);
    }

    public String getNomeDestino() {
        return aidBox.getZone();
    }

    public void setNomeDestino(String nomeDestino) {
        if(nomeDestino == null){
            System.out.println("Nome de destino inválido!");
            return;
        }
        this.aidBox.getZone();
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        if(distancia < 0){
            System.out.println("Valor de distância inválido!");
            return;
        }
        this.distancia = distancia;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        if(duracao < 0){
            System.out.println("Valor da duração inválido!");
            return;
        }
        this.duracao = duracao;
    }
}

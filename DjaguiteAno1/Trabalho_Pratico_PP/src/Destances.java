import com.estg.core.AidBox;

public class Destances {
    private int tamMax = 50;
    private AidBox aidBox;
    private int contador;
    private Destino[] destinos;

    public Destances() {
        this.contador = 0;
        this.destinos = new Destino[tamMax];
    }

    public String getNomeOrigem() {
        return aidBox.getZone();
    }


    public Destino[] getDestinos() {
        return destinos;
    }

    public void addDestances(Destino destino){
        if(destino == null){
           return;
        }
        if(this.contador == tamMax){
            this.tamMax = this.tamMax*2;
            Destino[] copyDestino = new Destino[this.tamMax];
            for(int i = 0; i < this.contador; i++){
                copyDestino[i] = this.destinos[i];
            }
            this.destinos = copyDestino;
        }
        this.destinos[this.contador] = destino;
        this.contador++;
    }
}

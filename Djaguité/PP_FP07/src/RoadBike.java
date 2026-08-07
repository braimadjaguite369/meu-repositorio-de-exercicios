import Enums.Cor;

public class RoadBike extends Bicycle {
    private int idenFitas;
    private float tamQuadro;
    private String observacoes;

    public RoadBike(double numVelocidade, Cor cor, double diametro, String tipoTravao,
                    String matConstrucao, double preco, int anosGarantia, int idenFitas,
                    float tamQuadro, String observacoes) {

        super(numVelocidade, cor, diametro, tipoTravao, matConstrucao, preco, anosGarantia);
        this.idenFitas = idenFitas;
        this.tamQuadro = tamQuadro;
        this.observacoes = observacoes.;
    }
    public RoadBike(double numVelocidade, Cor cor, double diametro, double preco,
                    int anosGarantia, int idenFitas, float tamQuadro, String observacoes) {

        super(numVelocidade, cor, diametro, preco, anosGarantia);
        this.idenFitas = idenFitas;
        this.tamQuadro = tamQuadro;
        this.observacoes = this._setObservacoes(observacoes);
    }

    public int getIdenFitas() {
        return idenFitas;
    }

    public void setIdenFitas(int idenFitas) {
        this.idenFitas = idenFitas;
    }

    public float getTamQuadro() {
        return tamQuadro;
    }

    public void setTamQuadro(float tamQuadro) {
        this.tamQuadro = tamQuadro;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = this._setObservacoes(observacoes);
    }
    private String _setObservacoes(String observacoes){
        return this.validacao(observacoes);
    }
    private String validacao(String observacoes){
        if(observacoes == null){
            return "EXCEDEU O TAMANHO";
        }
        String textoProcessado = (observacoes.length() > 50) ? observacoes.substring(0,50) : observacoes;
        return textoProcessado.toUpperCase();
    }
}

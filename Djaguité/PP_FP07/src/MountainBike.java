import Enums.Cor;
import Enums.TipoSuspencao;

public class MountainBike extends Bicycle {
    private static int contar = 1;
    private int numLuzes;
    private TipoSuspencao tipoSuspencao;
    private BikeTool[] utensilios;

    public MountainBike(double numVelocidade, Cor cor, double diametro, String tipoTravao,
                        String matConstrucao, double preco, int anosGarantia, int numLuzes,
                        TipoSuspencao tipoSuspencao) {

        super(numVelocidade, cor, diametro, tipoTravao, matConstrucao, preco, anosGarantia);
        this.numLuzes = numLuzes;
        this.tipoSuspencao = tipoSuspencao;
        utensilios = new BikeTool[5];
    }
    public addBikeTool(BikeTool bikeTool){
        if(bikeTool != null && utensilios.length < 5){
            for(BikeTool ut : utensilios){
                if(bikeTool.getName().equal(ut.getName())){
                    return "Este utensilio já existe";
                }
            }
            utensilios[contar] = bikeTool;
        }
    }

    public int getNumLuzes() {
        return numLuzes;
    }

    public void setNumLuzes(int numLuzes) {
        this.numLuzes = numLuzes;
    }

    public TipoSuspencao getTipoSuspencao() {
        return tipoSuspencao;
    }

    public void setTipoSuspencao(TipoSuspencao tipoSuspencao) {
        this.tipoSuspencao = tipoSuspencao;
    }

    public BikeTool[] getUtensilios() {
        return utensilios;
    }

    public void setUtensilios(BikeTool[] utensilios) {
        this.utensilios = utensilios;
    }
}

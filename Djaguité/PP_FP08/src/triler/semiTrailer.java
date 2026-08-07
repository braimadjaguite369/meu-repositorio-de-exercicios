package triler;

public class semiTrailer extends Triler {
    private int numPineu;

    public semiTrailer(int numEixos, int capacidade, int numPineu) {
        super(numEixos, capacidade);
        this.numPineu = numPineu;
    }

    public int getNumPineu() {
        return numPineu;
    }

    public void setNumPineu(int numPineu) {
        this.numPineu = numPineu;
    }
}

package triler;

import Enums.TrilerType;

public class TowHaul extends Triler{
    private TrilerType tipologia;

    public TowHaul(int numEixos, int capacidade, TrilerType tipologia) {
        super(numEixos, capacidade);
        this.tipologia = tipologia;
    }

    public TrilerType getTipologia() {
        return tipologia;
    }

    public void setTipologia(TrilerType tipologia) {
        this.tipologia = tipologia;
    }
}

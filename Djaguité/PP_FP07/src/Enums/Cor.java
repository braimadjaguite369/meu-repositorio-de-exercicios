package Enums;

public enum Cor {
    VERMELHO, VERDE, PRETO, AZUL, CINZA, AMARELO, ROSA;

    public String corParaString(Cor cor){
        switch (cor){
            case VERMELHO:
                return "Vermelho";
            case VERDE:
                return "Verde";
            case PRETO:
                return "Preto";
            case AZUL:
                return "Azul";
            case CINZA:
                return "Amarelo";
            case AMARELO:
                return "Amarelo";
            case ROSA:
                return "Rosa";
        }
    }
}

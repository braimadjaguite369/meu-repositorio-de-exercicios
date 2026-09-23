package Enums;

public enum Tipologia {
    TRUCK, TIR;
    public static String tipologiaParaString(Tipologia tipologia){
        switch (tipologia){
            case TIR -> {
                return "Tir";
            }
            case TRUCK -> {
                return "Turck";
            }
            default -> {
                return "Desconhecido";
            }
        }
    }
}

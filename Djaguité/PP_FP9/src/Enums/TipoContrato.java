package Enums;

public enum TipoContrato {
    PARCIAL, INTEGRAL;
    public static String tipoContratoParaString(TipoContrato tipo){
        switch (tipo){
            case PARCIAL:
                return "Parcial";
            case INTEGRAL:
                return "Integral";
            default:
                return "Desconhecido";
        }
    }
}

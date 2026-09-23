package Enums;

public enum Habilitacoes {
    LICENCIATURA, MESTRADO, DOUTORAMENTO;
    public static String habilitacaoParaString(Habilitacoes habilitacao){
        switch (habilitacao){
            case LICENCIATURA:
                return "Licenciatura";
            case MESTRADO:
                return "Mestratdo";
            case DOUTORAMENTO:
                return "Doutoramento";
            default:
                return "Desconhecido";
        }
    }
}

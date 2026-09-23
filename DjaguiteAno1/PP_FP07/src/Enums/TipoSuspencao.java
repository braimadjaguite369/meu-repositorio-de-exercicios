package Enums;

public enum TipoSuspencao {
    SIMPLES, DUPLA, SEM_SUSPENCAO;

    public String tipoSuspParaString(TipoSuspencao tipo) {
        switch (tipo) {
            case SIMPLES:
                return "Simples";
            case DUPLA:
                return "Dupla";
            case SEM_SUSPENCAO:
                return "Sem suspenção";
        }
    }
}

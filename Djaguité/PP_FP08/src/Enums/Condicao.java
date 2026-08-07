package Enums;

public enum Condicao {
    NEW("New"), USED("Used");

    private String descricao;
    Condicao (String descricao){
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return this.descricao;
    }
}

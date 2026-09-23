package Enums;

public enum Origem {
    NACIONAL("Nacional"), IMPORTADO("Nacional");

    private String descricao;
    Origem(String descricao){
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return this.descricao;
    }
}

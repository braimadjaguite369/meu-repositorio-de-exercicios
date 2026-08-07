package pp_fp05.cd;

public class Autor {
    protected String nome;
    protected int idade;
    protected String morada;
    protected int nif;
    protected int nib;
    protected String tipo;
    public Autor(String nome, String tipo, int idade, String morada, int nif, int nib) {
        this.nome = nome;
        this.tipo = tipo;
        this.idade = idade;
        this.morada = morada;
        this.nif = nif;
        this.nib = nib;
    }
}

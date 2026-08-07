package pp_fp05.cd;

public class Musica {
    protected int numeroFax;
    protected String nomeFax;
    protected double duracao;
    protected Autor[] autores;

    public Musica(int numFax, String nomeFax, double duracao){
        this.numeroFax = numFax;
        this.nomeFax = nomeFax;
        this.duracao = duracao;
        autores = new Autor[5];
    }
}

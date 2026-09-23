package pp_fp05.cd;

public class Cd {
    protected String nomeBanda;
    protected String nomeCd;
    protected double tempoTotal;
    protected int ano;
    protected String editor;
    protected Musica[] musicas;
    protected Artist[] artistas;
    public double preco;

    public Cd(String nomeBanda, String nomeCd, double tempoTotal, int ano, String editor, Artist[] artista){
        this.nomeBanda = nomeBanda;
        this.nomeCd = nomeCd;
        this.tempoTotal = tempoTotal;
        this.ano = ano;
        this.editor = editor;
       musicas = new Musica[15];
       this.artistas = artista;
    }
    public Cd(String nomeBanda, String nomeCd, double tempoTotal, int ano, String editor, Artist[] artista, double preco){
        this.nomeBanda = nomeBanda;
        this.nomeCd = nomeCd;
        this.tempoTotal = tempoTotal;
        this.ano = ano;
        this.editor = editor;
        musicas = new Musica[15];
        this.artistas = artista;
        this.preco = preco;
    }
}

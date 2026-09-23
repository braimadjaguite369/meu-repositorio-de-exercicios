public class File {
    private String nome;
    private String extensao;
    private int tamanho;
    private double duracao;

    public File(String nome, String extensao, int tamanho, double duracao) {
        this.nome = nome;
        this.extensao = extensao;
        this.tamanho = tamanho;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getExtensao() {
        return extensao;
    }


    public int getTamanho() {
        return tamanho*1024;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

}

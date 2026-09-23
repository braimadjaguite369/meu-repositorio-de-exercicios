public class Companhia {
    private String nome;
    private int numCont;

    public Companhia(String nome, int numCont) {
        this.setNome(nome);
        this.setNumCont(numCont);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumCont() {
        return numCont;
    }

    public void setNumCont(int numCont) {
        this.numCont = numCont;
    }
}

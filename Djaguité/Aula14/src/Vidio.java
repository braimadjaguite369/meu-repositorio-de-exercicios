public class Vidio implements AcessosVideo {
        private String titulo;
        private int avaliacao;
        private int viws;
        private int curtidas;
        private boolean reproduzindo;


    public Vidio(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.viws = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int)((this.avaliacao + avaliacao) / this.viws);
        this.avaliacao = nova;
    }

    public int getViws() {
        return viws;
    }

    public void setViws(int viws) {
        this.viws = viws;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtidas++;

    }
    @Override
    public String toString() {
        return "Vidio{" +
                "titulo='" + titulo + '\'' +
                ", avaliacao=" + avaliacao +
                ", viws=" + viws +
                ", curtidas=" + curtidas +
                ", reproduzindo=" + reproduzindo +
                '}';
    }
}

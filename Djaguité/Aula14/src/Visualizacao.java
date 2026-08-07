import java.awt.font.TextHitInfo;

public class Visualizacao {
    private Gafanhoto espectador;
    private Vidio filme;

    public Visualizacao(Gafanhoto espectador, Vidio filme){
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistidos(this.espectador.getTotAssistidos() + 1);
        this.filme.setViws(this.filme.getViws() + 1);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Vidio getFilme() {
        return filme;
    }

    public void setFilme(Vidio filme) {
        this.filme = filme;
    }

    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(float porc){
         int total = 0;
         if(porc <= 20){
             total = 4;
         } else if(porc <= 50){
             total = 6;
         } else if(porc <= 90){
             total = 8;
         } else {
             total = 10;
         }
         this.filme.setAvaliacao(total);
    }

    @Override
    public String toString() {
        return "Visualizacao{" +
                "espectador=" + espectador +
                ", filme=" + filme +
                '}';
    }
}

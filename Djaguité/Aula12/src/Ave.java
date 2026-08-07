public class Ave extends Animal {
    private String corPena;

    public void fazerNinho(){
        System.out.println("Construindo ninho");
    }
    public void locomover(){
        System.out.println("Voando");
    }
    public void alimentar(){
        System.out.println("Comendo graus");
    }
    public void emitirSom(){
        System.out.println("COOOO COOOO");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}

public class Reptil extends Animal {
    private String corEscama;

    public void locomover(){
        System.out.println("Rastejando");
    }
    public void alimentar(){
        System.out.println("Comendo vejetacao");
    }
    public void emitirSom(){
        System.out.println("SHOOOO");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}

public class Peixe extends Animal{
    private String corEscama;

    public void soltarBolha(){
        System.out.println("Soltando bolhas");
    }

    public void locomover(){
        System.out.println("Nadando");
    }
    public void alimentar(){
        System.out.println("Comendo flores");
    }
    public void emitirSom(){
        System.out.println("PIXEEEE");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}

public class Mamifero extends Animal{
    protected String corPele;

    public void locomover(){
        System.out.println("Correndo com " + this.getMembros() + " membros");
    }
    public void alimentar(){
        System.out.println("Mamando");

    }
    public void emitirSom(){
        System.out.println("Emitendo som");
    }

    public String getCorPele() {
        return corPele;
    }

    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }
}

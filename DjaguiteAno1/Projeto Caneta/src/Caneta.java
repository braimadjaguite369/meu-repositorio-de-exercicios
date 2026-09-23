//16/02/2026
//Braima Djaguité
//ESTG
//Projecto Caneta versão 1.0

public class Caneta{
    public String modelo;
    public String cor;
    private float furo; //ponta
    protected int carga;
    private boolean tampada;

    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
           this.tampada = false;
    }
    public void rabiscar(){
        if(tampada){
            System.out.println("Esta tampada nao pode rabiscar");
        } else{
            System.out.println("Rabiscando...");
        }
    }
    public void estado(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: "+ this.cor);
        System.out.println("Furo: "+ this.furo);
        System.out.println("Carga: "+ this.carga);
        System.out.println("Tampada: "+ this.tampada);

    }
    public void colocarFuro(float x){
        this.furo = x;
    }

}
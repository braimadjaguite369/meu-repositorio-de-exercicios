public class Criar {

    public static void main(String[] arg){
        Caneta c1 = new Caneta();
        c1.modelo = "Barato";
        c1.cor = "Azul";
        c1.colocarFuro(0.5f);
        c1.carga = 80;
        c1.destampar();

        c1.destampar();
        c1.estado();
        c1.rabiscar();

    Caneta c2 = new Caneta();
    c2.modelo = "Barato";
    c2.cor = "Vermelho";
    c2.colocarFuro(0.9f);
    c2.carga = 100;
    c2.tampar();
    c2.estado();
    c2.rabiscar();
    }
}

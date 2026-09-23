public class Main{
    public void main(String[] arg){
        Caneta c1 = new Caneta("NIC", "Vermelho", 0.5f);
        Caneta c2 = new Caneta("BIC", "Azul", 0.6f);
        Caneta c3 = new Caneta("DJAGUITÉ", "Verde", 1.0f);
        /*c1.setModelo("BIC");
        c1.setCor("Azul");
        c1.setPonta(0.5f);
        c1.destampar();*/
        //System.out.println("Modelo: " + c1.getModelo());
        //System.out.println("Cor: " + c1.getCor());
        c1.stado();
        c2.stado();
        c3.stado();

    }
}
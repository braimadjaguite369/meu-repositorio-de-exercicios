public class Circulo extends Shape {
    protected double raio;

    public Circulo(String cor, boolean preenchido, double raio){
          super(cor, preenchido);
          this.setRaio(raio);
    }
    public Circulo(boolean preenchido, String cor){
           super(preenchido);
           this.setCor(cor);
    }
    public Circulo(boolean preenchido, double raio){
           super(preenchido);
           this.setRaio(raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    @Override
    public double getArea(){
        return 3.14*((raio)*(raio));
    }
    @Override
    public double getPerimetro(){
        return 2*3.14*raio;
    }

    @Override
    public String toString() {
        return "Circulo: " + super.toString() + "raio " + raio;
    }
}

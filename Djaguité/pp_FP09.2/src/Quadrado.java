public class Quadrado extends Shape {
    protected double largura;

    public Quadrado(String cor, boolean preenchido, double largura){
           super(cor, preenchido);
           this.setLargura(largura);
           this.setLargura(largura);
    }
    public Quadrado(boolean preenchido, double largura){
        super(preenchido);
        this.setLargura(largura);
    }
    public Quadrado(boolean preenchido, String cor){
        super(cor, preenchido);
    }
    public Quadrado(boolean preenchido){
        super(preenchido);
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
    @Override
    public double getArea(){
        return getLargura()*getLargura();
    }
    @Override
    public double getPerimetro(){
        return 4*getLargura();
    }

    @Override
    public String toString() {
        return "Quadrado: " + super.toString() + "largura " + largura;
    }
}

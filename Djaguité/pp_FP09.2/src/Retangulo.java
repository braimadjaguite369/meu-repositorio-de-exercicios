public class Retangulo extends Quadrado{
    protected double altura;

    public Retangulo(String cor, boolean preenchido, double largura, double altura){
        super(cor, preenchido, largura);
        this.setAltura(altura);
    }
    public Retangulo(boolean preenchido, double largura, double altura){
        super(preenchido, largura);
        this.setAltura(altura);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return getLargura()*altura;
    }

    @Override
    public double getPerimetro() {
        return (2*altura) + (2*getLargura());
    }

    @Override
    public String toString() {
        return super.toString() + "altura:" + this.altura;
    }
}

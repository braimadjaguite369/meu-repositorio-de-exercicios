public abstract class Shape {
    public static int proxId = 1;
    protected int id;
    protected String cor;
    protected boolean preenchido;

    public Shape(String cor, boolean preenchido){
        this.id = proxId++;
        this.setCor(cor);
        this.setPreenchido(preenchido);
    }
    public Shape(boolean preenchido){
        this.setPreenchido(preenchido);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isPreenchido() {
        return preenchido;
    }

    public void setPreenchido(boolean preenchido) {
        this.preenchido = preenchido;
    }
    public abstract double getArea();
    public abstract double getPerimetro();

    @Override
    public String toString() {
        return "Shape: " + "cor='" + cor + ", preenchido=" + preenchido + '}';
    }
}

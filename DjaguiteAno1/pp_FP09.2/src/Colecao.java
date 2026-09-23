public class Colecao {
    private int numSchape;
    private Shape[] shapes;

    public Colecao(){
        shapes = new Shape[200];
        this.numSchape = 0;
    }

    public Shape[] getShapes() {
        Shape[] copia = new Shape[numSchape];
        for(int i = 0; i < numSchape; i++){
            copia[i] = shapes[i];
        }
        return copia;
    }
    public void addShape(Shape shape){
        if(numSchape == shapes.length){
            Shape[] novo = new Shape[this.numSchape*2];
            for(int i = 0; i < this.numSchape; i++){
                novo[i] = shapes[i];
            }
            shapes = novo;
        }
        if(shape != null){
            this.shapes[numSchape] = shape;
            numSchape++;
        }
    }
    public void listar(){
        for(Shape s : this.shapes){
            if(s != null){
                System.out.println(s.toString());
            }
        }
    }
    public void listarCirculos(){
        for(Shape s : this.shapes){
            if(s instanceof Circulo circulo){
                System.out.println(circulo.toString());
            }
        }
    }

    //Depois continuo com os outros métodos
}

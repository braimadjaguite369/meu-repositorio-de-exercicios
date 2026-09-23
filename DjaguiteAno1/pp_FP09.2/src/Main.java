//20/04/2026
//Braima Djaguité         ESTG

public class Main{
        public void main(String[] arg){
            Retangulo retangulo = new Retangulo("Verde", true, 3, 2);
            Circulo circulo = new Circulo("Azul", false, 3);
            Colecao colecao = new Colecao();
            colecao.addShape(retangulo);
            colecao.addShape(circulo);
            colecao.listar();
            Shape[] shapes = new Shape[3];
            shapes = colecao.getShapes();
            shapes[0] = null;
            colecao.listar();
            colecao.listarCirculos();
            //System.out.println(shapes[0].cor);
        }
}
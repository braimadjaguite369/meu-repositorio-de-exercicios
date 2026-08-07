public class DemoCalculadora {
    public static void main(String[] args){
        AddStrategy add = new AddStrategy();
        Calcular soma = new Calcular(add);
        Calcular mult = new Calcular(new MultpStrategy());
        Calcular div = new Calcular(new DivStrategy());
        System.out.println(div.calcular(16, 3));
    }
}

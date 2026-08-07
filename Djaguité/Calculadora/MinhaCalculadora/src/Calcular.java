public class Calcular {
   Strategy strategy;
   Calcular(Strategy strategy){
      this.strategy = strategy;
   }
   public int calcular(double a, double b){
    return strategy.calcular(a, b);
   }
}

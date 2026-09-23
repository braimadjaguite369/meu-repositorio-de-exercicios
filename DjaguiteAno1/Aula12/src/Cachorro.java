public class Cachorro {
    public void enterrarOsso(){
        System.out.println("Enterrando osso");
    }
    public void reagir(String frase){
         if(frase.equals("Ola") || frase.equals("Dança")){
             System.out.println("Abanando o rabo");
         } else{
             System.out.println("Rosnando");
         }
    }
    public void reagir(boolean dono){
           if(dono){
               System.out.println("Abanando o rabo");
           } else{
               System.out.println("Rosnando");
           }
    }
    public void reagir(int hora, int min){
           if(hora < 12 && min <= 59){
               System.out.println("Abanando o rabo");
           } else if(hora >= 18 && min <= 59){
               System.out.println("Abanando o rabo");
           } else{
               System.out.println("Rosnando");
           }
    }
    public void reagir(int idade, float peso){
          if(idade <= 5 && peso <= 45.0){
              System.out.println("Abanando o rabo");
          } else{
              System.out.println("Rosnando");
          }
    }

}

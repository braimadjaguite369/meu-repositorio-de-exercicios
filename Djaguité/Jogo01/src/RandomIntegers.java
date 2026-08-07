import java.security.SecureRandom;

public class RandomIntegers {
       public static void main(){
           SecureRandom escolha = new SecureRandom();
           long num1 = 0;
           long num2 = 0;
           long num3 = 0;
           long num4 = 0;
           long num5 = 0;
           long num6 = 0;
           for(long i = 1; i <= 6000000; i++){
               int valor = 1 + escolha.nextInt(6);
               switch (valor){
                   case 1:
                       num1++;
                       break;
                   case 2:
                       num2++;
                       break;
                   case 3:
                       num3++;
                       break;
                   case 4:
                       num4++;
                       break;
                   case 5:
                       num5++;
                       break;
                   case 6:
                       num6++;
                       break;
               }
           }
           System.out.println("1: " + num1 + " " + ((num1/6000000.0) * 100) + "%");
           System.out.println("2: " + num2 + " " + ((num2/6000000.0) * 100) + "%");
           System.out.println("3: " + num3 + " " + ((num3/6000000.0) *100) + "%");
           System.out.println("4: " + num4 + " " + ((num4/6000000.0) *100) + "%");
           System.out.println("5: " + num5 + " " + ((num5/6000000.0) * 100) + "%");
           System.out.println("6: " + num6 + " " + ((num6/6000000.0) * 100) + "%");
       }
}

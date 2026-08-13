package implementacoes;

import java.util.Arrays;

public class Recurcao {
    
    public int fatorial(int n){
        if(n == 0){
            return 1;
        } 
        else{
            return n * fatorial(n - 1);
        }
    }

    public int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        } //ou, para simplificar, poderias usar if(n <= n) retorna o n.
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    
    }

    public int sum(int[] array, int n){
      if(n < 0){
        return 0;
      }
      else{
        return array[n] + sum(array, n - 1);
      }
    }
    
    public int sum(int[] array){
        if(array.length == 0){
            return 0;
        }
        int[] arrayFatiado = Arrays.copyOfRange(array, 1, array.length);
        return array[0] + sum(arrayFatiado);
    }
    public int numItens(int[] lista){
        if(lista.length == 0){
            return 0;
        }
        int[] listaFatiada = Arrays.copyOfRange(lista, 1, lista.length);
        return 1 + numItens(listaFatiada);
    }

}

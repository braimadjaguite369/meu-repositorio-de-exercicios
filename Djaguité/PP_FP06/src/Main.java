//09/03/2026
//Braima Djaguité
//ESTG  Engenharia informática

import pp_fp06.pizza_restaurant.Ementa;
import pp_fp06.pizza_restaurant.Ingridientes;
import pp_fp06.pizza_restaurant.Pizza;
import pp_fp06.pizza_restaurant.enums.Origem;
import pp_fp06.pizza_restaurant.enums.Tamanho;

import java.util.Arrays;

public class Main{
    public static void main(){
        Ingridientes ing1 = new Ingridientes("Gusto", Origem.VEGETAL, 23.8f);
        Ingridientes ing2 = new Ingridientes("Sal", Origem.MINERAL, 10.0f);
        Ingridientes ing3 = new Ingridientes("Tomate", Origem.VEGETAL, 30.2f);

        Pizza[] pizza = new Pizza[2];
        pizza[0] = new Pizza("Pizza doce", "Feito com carNe de boi", 12.0, Tamanho.GRANDE);
        pizza[1] = new Pizza("Pizza melado", "Com brocles", 8.0, Tamanho.MEDIO);
        pizza[0].adIngrediente(ing1);
        pizza[0].adIngrediente(ing2);
        pizza[0].adIngrediente(ing3);
        pizza[1].adIngrediente(ing1);
        //pizza[0].apresentar();
        pizza[0].remIngrediente(3);
        //pizza[0].apresentar();
        Ementa em = new Ementa("Tradicional", "Vegetariana", "2026-03-10" );
        em.adPizza(pizza[0]);
        em.adPizza(pizza[1]);
        em.apresentar();

    }
}
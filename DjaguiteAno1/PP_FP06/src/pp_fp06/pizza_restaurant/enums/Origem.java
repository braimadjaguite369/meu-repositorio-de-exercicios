package pp_fp06.pizza_restaurant.enums;

public enum Origem {
    ANIMAL, VEGETAL, MINERAL;

    public static String origemParaString(Origem origem){
        switch (origem){
            case ANIMAL:
                return "O INGREDIENTE É DE ORIGEM ANIMAL";
            case VEGETAL:
                return "O INGREDIENTE É DE ORIGEM VEGETAL";
            default:
                return "O INGREDIENTE É DE ORIGEM MINERAL";
        }
    }
}

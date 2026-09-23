package pp_fp06.pizza_restaurant.enums;

    public enum Tamanho {
        MEDIO,  PEQUENPO, GRANDE;

        public static String tamanhoParaString(Tamanho tamanho){
            switch (tamanho){
                case MEDIO:
                    return "A PIZZA É DE TAMANHO MEDIO";
                case PEQUENPO:
                    return "A PIZZA E DE TAMANHO PEQUENO";
                default:
                    return "A PIZZA É GRANDE";
            }
        }
    }
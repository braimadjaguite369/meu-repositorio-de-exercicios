package pp_fp06.pizza_restaurant;

import pp_fp06.pizza_restaurant.enums.Origem;

public class Ingridientes {
    private static int codigoNovo = 1;
    private int codigo;
    private String nome;
    private Origem origem;
    private float numeroCalorias;

    public Ingridientes(String nome, Origem origem, float numeroCalorias){
        this.codigo = codigoNovo++;
        this.nome = nome;
        this.origem = origem;
        this.numeroCalorias = numeroCalorias;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return nome;
    }

    public Origem getOrigem() {
        return this.origem;
    }

    public float getNumeroCalorias() {
        return numeroCalorias;
    }
}

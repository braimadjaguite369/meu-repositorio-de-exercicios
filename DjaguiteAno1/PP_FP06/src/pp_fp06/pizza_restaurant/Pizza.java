package pp_fp06.pizza_restaurant;

import pp_fp06.pizza_restaurant.enums.Origem;
import pp_fp06.pizza_restaurant.enums.Tamanho;
import static pp_fp06.pizza_restaurant.enums.Origem.origemParaString;
import static pp_fp06.pizza_restaurant.enums.Tamanho.tamanhoParaString;

public class Pizza {
    private static int codigoNovo = 1;
    private int codigo;
    private String nome;
    private String discricao;
    private double preco;
    private int numIngridiente;
    private Tamanho tamanho;
    private Ingridientes[] ingridientes;

    public Pizza(String nome, String discricao, double preco, Tamanho tamanho){
          this.codigo = codigoNovo++;
          this.nome = nome;
          this.discricao = discricao;
          this.preco = preco;
          this.tamanho = tamanho;
          this.numIngridiente = 0;
          ingridientes = new Ingridientes[3];
    }
    private boolean buscar(int codigo){
        for(int i = 0; i < this.numIngridiente; i++){
            if(this.ingridientes[i].getCodigo() == codigo){
                return true;
            }
        }
        return false;
    }
    private int posicao(int codigo){
        for(int i = 0; i < this.numIngridiente; i++){
            if(this.ingridientes[i].getCodigo() == codigo){
                return i;
            }
        }
        return -1;
    }
    public void adIngrediente (Ingridientes ingridientes) {

        if(!buscar(ingridientes.getCodigo())){
            this.ingridientes[this.numIngridiente] = ingridientes;
            this.numIngridiente++;
        } else{
            System.out.println("O ingrediente já existe.");
        }
    }
    public void remIngrediente(int codigo){
         if(buscar(codigo)) {
             this.ingridientes[posicao(codigo)] = this.ingridientes[numIngridiente - 1];
             this.ingridientes[numIngridiente - 1] = null;
             numIngridiente--;
        }
    }
    private float calculoCal(){
        float total = 0.0f;
        for(Ingridientes ingridientes : this.ingridientes){
            if(ingridientes != null){
               total += ingridientes.getNumeroCalorias();
            }
        }
        return total;
    }
    public void apresentar(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Codigo: " + this.getCodigo());
        System.out.println("Numero de ingredientes: " + this.getNumeroIngridiente());
        System.out.println("Tamanho: " + Tamanho.tamanhoParaString(getTamanho()));
        System.out.println("Discricao: " + this.getDiscricao());
        System.out.println("Preço: " + this.getPreco());
        System.out.println("---- DADOS DE INGREDIENTES -----");
        for(Ingridientes ingridientes: this.ingridientes){
            if(ingridientes != null){
               System.out.println("Nome: " + ingridientes.getNome());
               System.out.println("Codigo: " + ingridientes.getCodigo());
               System.out.println("Origem: " + Origem.origemParaString(ingridientes.getOrigem()));
               System.out.println("Numero de calorias: " + ingridientes.getNumeroCalorias());
            }
        }
        System.out.println("Total de calorias: " + this.calculoCal());

    }
    public void apresentarIng(int codigo){
        if(buscar(codigo)){
            int i = posicao(codigo);
            System.out.println("Nome: " + this.ingridientes[i].getNome());
            System.out.println("Origem: " + Origem.origemParaString(this.ingridientes[i].getOrigem()));
            System.out.println("Numero de calorias: " + this.ingridientes[i].getNumeroCalorias());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiscricao() {
        return discricao;
    }

    public void setDiscricao(String discricao) {
        this.discricao = discricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getCodigo(){
        return this.codigo;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public int getNumeroIngridiente() {
        return numIngridiente;
    }

    public void setNumeroIngridiente(int numeroIngridiente) {
        this.numIngridiente = numeroIngridiente;
    }

    public Ingridientes[] getIngidientes() {
        return ingridientes;
    }

    public void setIngidientes(Ingridientes[] ingidientes) {
        this.ingridientes = ingidientes;
    }
}

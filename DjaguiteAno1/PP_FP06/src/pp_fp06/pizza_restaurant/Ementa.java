package pp_fp06.pizza_restaurant;
import java.time.LocalDate;
public class Ementa {
    private static int codigoNovo = 1;
    private String designacao;
    private String discricao;
    private  int codigo;
    private LocalDate dataInicio;
    private  LocalDate dtaFim;
    private int numPizza;
    private Pizza[] pizzas;

    public Ementa(String designacao, String discricao, String dataInicioString){
            this.designacao = designacao;
            this.discricao = discricao;
            this.codigo = codigoNovo++;
            this.numPizza = 0;
            this.dataInicio = LocalDate.parse(dataInicioString);
            pizzas = new Pizza[10];
    }
    public void adPizza(Pizza pizza){
        for(int i = 0; i < this.numPizza; i++){
            if(this.pizzas[i].getCodigo() == pizza.getCodigo()){
                System.out.println("O pizza com este codigo ja existe");
            }
        }
        this.pizzas[this.numPizza] = pizza;
        this.numPizza++;

    }
    public void remPizza(int codigo){
        for(int i = 0; i < this.numPizza; i++){
            if(this.pizzas[i].getCodigo() == codigo){
                this.pizzas[i] = this.pizzas[numPizza - 1];
                this.pizzas[numPizza -1] = null;
                numPizza--;
            }
        }
        System.out.println("Este pizza não existe");
    }
    public void apresentar(){
        System.out.println("Designação: " + this.getDesignacao());
        System.out.println("Discrição: " + this.getDiscricao());
        System.out.println("Data de inicio: " + this.dataInicio);
        System.out.println("----------Dados da pitzza---------");
        for(Pizza pizza : pizzas){
            if(pizza != null){
                pizza.apresentar();
            }
        }
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public String getDiscricao() {
        return discricao;
    }

    public void setDiscricao(String discricao) {
        this.discricao = discricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDataInicio() {
        return dataInicio.toString();
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDtaFim() {
        return dtaFim.toString();
    }

    public void setDtaFim(LocalDate dtaFim) {
        this.dtaFim = dtaFim;
    }

    public int getNumPizza() {
        return numPizza;
    }

    public void setNumPizza(int numPizza) {
        this.numPizza = numPizza;
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }

    public void setPizzas(Pizza[] pizzas) {
        this.pizzas = pizzas;
    }
}

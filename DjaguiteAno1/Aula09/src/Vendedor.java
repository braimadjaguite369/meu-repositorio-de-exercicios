
public class Vendedor extends Pessoa {
    private double totalGanho;
    Livro livro;

    public Vendedor(String nome, int idade, char sexo, Livro livro){
        super(nome, idade, sexo);
        this.livro = livro;
    }
    public double getTotalGanho(){
        return totalGanho;
    }
    public void setTotalGasto(double total){
        this.totalGanho = total;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void vender(double preco){
        if(livro.getPreco() == preco){
            System.out.println("Vendido!");
            setTotalGasto(getTotalGanho() + preco);
        } else{
            System.out.println("Nao pagou o valor justo");
        }
    }
    public void detralheVendedor(){
        System.out.println("Nome:" + this.getNome());
        System.out.println("Idade:" + this.getIdade());
        System.out.println("-------------LIVRO A VENDER-------------");
        System.out.println("Titulo: " + this.livro.getTitulo());
        System.out.println("Autor: " + this.livro.getAutor());
        System.out.println("Total de paginas: " + this.livro.getTotPaginas());
        System.out.println("Preço:" + this.livro.getPreco());

    }
}

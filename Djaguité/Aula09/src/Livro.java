public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    private double preco;

    public Livro(String sapiens, String yuval, int i, Pessoa let) {
        this.setTitulo(sapiens);
        this.setAutor(yuval);
        this.setTotPaginas(i);
        this.aberto = false;
        this.pagAtual = 0;
        this.setLeitor(let);
    }
    public Livro(String sapiens, String yuval, int i, double preco) {
        this.setTitulo(sapiens);
        this.setAutor(yuval);
        this.setTotPaginas(i);
        this.aberto = false;
        this.pagAtual = 0;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    private int getPagAtual() {
        return pagAtual;
    }

    private void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    private boolean isAberto() {
        return aberto;
    }

    private void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    private Pessoa getLeitor() {
        return this.leitor;
    }

    private void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void detalhes(){
         System.out.println("Titulo: " + this.getTitulo());
         System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de paginas: " + this.getTotPaginas());
        System.out.println("Pagina atual: " + this.getPagAtual());
        System.out.println("Aberto: " + this.isAberto());
        System.out.println("-------------------- Leitor -----------------");
        System.out.println(this.getLeitor().getNome());
        System.out.println("Idade: " + this.getLeitor().getIdade());
        System.out.println("Sexo: " + getLeitor().getSexo());

    }
    @Override
    public void abrir(){
        this.setAberto(true);
        this.setPagAtual(this.getPagAtual() + 1);
    }
    @Override
    public void fechar(){
        this.setAberto(false);
    }
    @Override
    public void folhar(int p){
        if(this.isAberto()){
            if(p <= getTotPaginas()){
            System.out.println("Folhando");
            this.setPagAtual(p);
            } else{
                System.out.println("Essa pagina excede o total de paginas");
                this.setPagAtual(this.getTotPaginas());
            }
        } else{
            System.out.println("Fechado, nao pode folhar");
        }
    }

    @Override
    public void avancarPag(){
        if(this.isAberto() && this.getTotPaginas() > this.getPagAtual()){
            System.out.println("Avancou uma pagina");
           setPagAtual(getPagAtual() + 1);
        } else{
           System.out.println("Esta fechado ou esta na ultima pagina, nao pode avancar");
        }
    }

    @Override
    public void voltarPag(){
        if(this.isAberto() && this.getPagAtual() > 1){
           System.out.println("Voultou uma pagina");
           setPagAtual(getPagAtual() - 1);
        } else{
           System.out.println("Esta fechado ou esta na primeira pagina, nao pode recuar a pagina");
        }
    }
}

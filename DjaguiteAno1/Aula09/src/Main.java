// 21/02/2026
//Braima Djaguité
// Engenharia informatica
//ESTG

public class Main{
    public void main(){
        Pessoa[] leitor = new Pessoa[2];
        Livro[] livro = new Livro[3];        
        leitor[0] = new Pessoa("Braima", 21, 'M');
        leitor[1] = new Pessoa("Natalia", 23, 'F');
        
        livro[0] = new Livro("Sapiens", "Yuval", 200, leitor[0]);
        livro[1] = new Livro("O enaio sobre a cegueira", "Saramago", 280, leitor[1]);
        Livro venda = new Livro("Clean Code", "Djaguite", 370, 100.0);
        Vendedor vendedor = new Vendedor("Amade", 23, 'M', venda);
        livro[0].detalhes();
        livro[0].avancarPag();
        livro[0].abrir();
        livro[0].folhar(150);
        livro[0].detalhes();
        vendedor.detralheVendedor();
    }
}
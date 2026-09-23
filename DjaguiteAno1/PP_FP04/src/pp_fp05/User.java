package pp_fp05;

public class User {
    protected final int TAM = 31;
    protected static int codigoGlob = 100;
    protected int codigo;
    protected String name;
    protected String email;
    protected String data;
    public Express[] despesas;
    public User(String nome, String email, String data){
        despesas = new Express[TAM];
        this.codigo = codigoGlob++;
        this.name = nome;
        this.email = email;
        this.data = data;
    }
    public void adicionarDespesa(String tipo, float montante, String data, int dia){
          despesas[dia - 1] = new Express(tipo, montante, data);

    }

    public void detalhes(int limite){
        System.out.println("Nome: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Data: " + this.data);
        System.out.println("Codigo: " + this.codigo);
        System.out.println("------------ DESPESAS --------------");
        for(int i = 0; i < limite; i++){
            System.out.println("ID: " + this.despesas[i].id);
            System.out.println("Tipo: " + this.despesas[i].tipo);
            System.out.println("Data: " + this.despesas[i].data);
            System.out.println("Montante: " + this.despesas[i].montante);
        }
    }


}

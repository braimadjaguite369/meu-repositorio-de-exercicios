public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;

    public Pessoa(String nome, int idade, char sexo){
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    private void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void fazerAniver(){
          this.setIdade(this.getIdade() + 1);
    }

    }

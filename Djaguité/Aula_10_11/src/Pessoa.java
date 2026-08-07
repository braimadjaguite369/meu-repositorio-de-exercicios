public abstract class Pessoa {
    private String name;
    private int idade;
    private String sexo;

    public void fazerAniversario(){
        this.idade = this.idade + 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }
    public void mostrar(){
         System.out.println("Nome: " + this.getName());
         System.out.println("Idade: " + this.getIdade());
         System.out.println("Curso:" + this.getSexo());
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}

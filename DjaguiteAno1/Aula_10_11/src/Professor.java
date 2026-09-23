public class Professor extends Pessoa{
    private String especialidade;
    private double salario;

    public Professor (String nome, int idade, String sexo, String especialidade, double sal){
        setName(nome);
        setIdade(idade);
        setSexo(sexo);
        setEspecialidade(especialidade);
        setSalario(sal);
    }
    public void receberAumento(double salario){
        setSalario(getSalario() + salario);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

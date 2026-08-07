public class Aluno extends Pessoa{
    private boolean matricula;
    private String curso;

    public Aluno (String nome, int idade, String sexo, String curso){
        setName(nome);
        setIdade(idade);
        setSexo(sexo);
        setCurso(curso);
        setMatricula(true);
    }

    public void cancelarMatr(){
           if(matricula){
               setMatricula(false);
           }
    }

    public boolean isMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}

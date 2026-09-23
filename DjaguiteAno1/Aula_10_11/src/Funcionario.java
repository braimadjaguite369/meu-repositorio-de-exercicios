public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    public Funcionario (String nome, int idade, String sexo, String setor) {
        setName(nome);
        setIdade(idade);
        setSexo(sexo);
        setSetor(setor);
        setTrabalhando(true);
    }

    public void mudarTrabalho() {
         setTrabalhando(false);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
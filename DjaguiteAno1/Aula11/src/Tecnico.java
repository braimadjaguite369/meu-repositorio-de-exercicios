public class Tecnico extends Aluno {

    private boolean registado;

    public Tecnico(String nome, int idade, String sexo, int matricula, String curso) {
        super(nome, idade, sexo, matricula, curso);
        setRegistado(true);
    }

    public void praticar(){
        System.out.println("Praticando");
    }
    @Override
    public void pagarMensal(){
        System.out.println("Tecnico pagando mensalidade");
    }

    public boolean isRegistado() {
        return registado;
    }

    public void setRegistado(boolean registado) {
        this.registado = registado;
    }
}

public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistidos;


    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistidos = 0;
    }

    public void viuMaisUm(){
          this.totAssistidos++;
    }
    @Override
    public void ganharExp(){
        setExperiencia(getExperiencia() + 1);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistidos() {
        return totAssistidos;
    }

    public void setTotAssistidos(int totAssistidos) {
        this.totAssistidos = totAssistidos;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() +
                "\nlogin='" + login + '\'' +
                ", totAssistidos=" + totAssistidos +
                '}';
    }
}

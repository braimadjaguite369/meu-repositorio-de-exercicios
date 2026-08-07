public class Bolsista extends Aluno {
    private float bolsa;

    public Bolsista(String nome, int idade, String sexo, int matricula, String curso, float bolsa){
        super(nome, idade, sexo, matricula, curso);
        setBolsa(bolsa);
    }
    public void renovarBolsa(){
        System.out.println("Renovando a bolsa");
    }
    @Override
    public void pagarMensal(){
        System.out.println("O bolsista pagou mensalidade");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}

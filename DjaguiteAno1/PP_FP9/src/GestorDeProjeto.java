import javax.xml.transform.Source;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
public class GestorDeProjeto extends Funcionario {
    private int codigoFuncionario;
    private Projecto[] projectos;
    private LocalDate dataContratacao;
    private int numProjectos;

    public GestorDeProjeto(String name, String data, String morada, int numCartao, int numIdFiscal, double salarioBase,
                           int codigoFuncionario, String dataContratacao) {
        super(name, data, morada, numCartao, numIdFiscal, salarioBase);
        this.codigoFuncionario = codigoFuncionario;
        projectos = new Projecto[20];
        this.dataContratacao = LocalDate.parse(dataContratacao);
    }

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public Projecto[] getProjectos() {
        Projecto[] copia = new Projecto[numProjectos];
        for(int i = 0; i < numProjectos; i++){
            copia[i] = projectos[i];
        }
        return copia;
    }


    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public int anoDeContratacao(){
        LocalDate hoje = LocalDate.now();
        Period period = Period.between(getDataContratacao(), hoje);
        return period.getYears();
    }

    public int getNumProjectos() {
        return numProjectos;
    }

    @Override
    public double calcSalario() {
        int numAno = anoDeContratacao();
        int numProjeto = getNumProjectos();
        double salarioInicial = (getSalarioBase() * (1.15));
        return ((salarioInicial) + ((salarioInicial*0.15*numAno) + (salarioInicial* 0.01 * numProjeto)));
    }
    public void addProjecto(Projecto projecto){
          if(projecto == null){
              throw new IllegalArgumentException("Projecto invalido");
          }
          projectos[numProjectos] = projecto;
          numProjectos++;
    }
    public void remProjecto(int indice){
        for(int i = indice; i < numProjectos; i++){
            projectos[i] = projectos[i+1];
        }
        projectos[numProjectos] = null;
        numProjectos--;
    }
    public void editProjecto(int indice, String novoNome){
         projectos[indice].setName(novoNome);
    }
    public void listarProjetos(){
        for(Projecto proj : projectos){
            if(proj != null){
            System.out.println("Nome do projecto: " + proj.getName());
            System.out.println("ID: " + proj.getId());
            }
        }
    }
    @Override
    public void apresentar(){
        System.out.println("Nome: " + getName());
        System.out.println("Data: " + getData());
        System.out.println("Morada: " + getMorada());
        System.out.println("Numero de cartão: " + getNumCartao());
        System.out.println("Numero fiscal: " + getNumIdFiscal());
        System.out.println("Salário Base: " + getSalarioBase());
        System.out.println("Código de funcionário: " + getCodigoFuncionario());
        System.out.println("----------- PROJECTOS --------");
        this.listarProjetos();
        System.out.println("Data de contratação: " + getDataContratacao().toString());
        System.out.println("Numero de projectos: " + getNumProjectos());
    }
}

public class ProgrammingManagement {
    private Funcionario[] funcionarios;
    private int numFuncionaros;

    public ProgrammingManagement(){
        this.funcionarios = new Funcionario[50];
        this.numFuncionaros = 0;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public int getNumFuncionaros() {
        return numFuncionaros;
    }


    public void addFuncionario(Funcionario funcionario){
        if(this.numFuncionaros == this.funcionarios.length){
            Funcionario[] novoArray = new Funcionario[this.numFuncionaros*2];
            for(int i = 0; i < this.numFuncionaros; i++){
                novoArray[i] = this.funcionarios[i];
            }
            this.funcionarios = novoArray;
        }
        if(funcionario != null){
           this.funcionarios[this.numFuncionaros] = funcionario;
           this.numFuncionaros++;
        }
    }
    public void remFuncionario(int id){
        for(int i = id - 1; i < numFuncionaros - 1; i++){
            this.funcionarios[i] = this.funcionarios[i+1];
        }
        funcionarios[numFuncionaros - 1] = null;
        numFuncionaros--;
    }
    public void listarFunfionarios(){

        for(Funcionario func : this.funcionarios){
           if(func != null){
              func.apresentar();
           }
        }
        System.out.println();
    }
    public void listarGestores(){
        System.out.println("---------------Os gestores----------");
        for(Funcionario func : this.funcionarios){
            if(func instanceof GestorDeProjeto gestor){
                gestor.apresentar();
            }
        }
    }
}

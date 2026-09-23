public class Veiculos {
    Veiculo[] veiculos;
    private int numVeiculos;

    public Veiculos() {
        this.veiculos = new Veiculo[50];
        this.numVeiculos = 0;
    }

    public Veiculo[] getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(Veiculo[] veiculos) {
        this.veiculos = veiculos;
    }

    private boolean existe(Veiculo novo){
        for(Veiculo veiculo : this.veiculos){
            if(veiculo != null && veiculo.equals(novo)){
                return true;
            }
        }
        return false;
    }
    public void addVeiculo(Veiculo veiculo){
        if(this.numVeiculos == this.veiculos.length){
            Veiculo[] novoArray = new Veiculo[this.numVeiculos*2];
            for(int i = 0; i < this.numVeiculos; i++){
                novoArray[i] = this.veiculos[i];
            }
            this.veiculos = novoArray;
        }
        if(veiculo != null && !existe(veiculo)){
            this.veiculos[numVeiculos] = veiculo;
            numVeiculos++;
        } else if (veiculo != null){
            System.out.println("O veiculo não foi guardado, pos já existe um veículo com o meso número de chassis." + existe(veiculo));
        }
    }
    public void remVeiculo(int id){
        for(int i = id - 1; i < numVeiculos - 1; i++){
            this.veiculos[i] = this.veiculos[i+1];
        }
        veiculos[numVeiculos - 1] = null;
        numVeiculos--;
    }
    public String apresentarVeiculosPorTipo(){
        int mota = 0, caro = 0, pesado = 0;
        for(Veiculo veiculo : this.veiculos){
            if(veiculo != null){
              if(veiculo instanceof Car){
                caro++;
              }
              if(veiculo instanceof Motociclo){
                mota++;
              }
              if(veiculo instanceof Truck){
                pesado++;
              }
            }
        }
        return "Existe " + mota + " Motociclos,  " + caro + " Caros e " + pesado + " Pesados.";
    }
    public void listarVeiculos(){
        for (Veiculo veiculo : this.veiculos){
            if(veiculo != null){
                System.out.println("------------DADOS DO VEÍCULO------------");
                System.out.println(veiculo.toString());
            }
        }
    }
}

import Enums.Condicao;
import Enums.Origem;

public class Car extends Veiculo {
    private int ocupantsNum;
    private int doorNum;

    public Car(int numChassis, String marca, String modelo, String dataFabric, Origem origem,
               int numKm, Condicao condicao, double preco, int ocupantsNum, int doorNum) {
        super(numChassis, marca, modelo, dataFabric, origem, numKm, condicao, preco);
        this.ocupantsNum = ocupantsNum;
        this.doorNum = doorNum;
    }

    public int getOcupantsNum() {
        return ocupantsNum;
    }
    public int getDoorNum() {
        return doorNum;
    }

    @Override
    public double calcPreco(){
        if(this.getCondicao() == Condicao.NEW){
            return this.getPreco();
        }
        if(this.getCondicao() == Condicao.USED){
            return (this.getPreco() - (0.3*getPreco()));
        }
        return 0;
    }
    @Override
    public String toString() {
        return "Car{" + super.toString() +
                "ocupantsNum = " + ocupantsNum + ", doorNum = " + doorNum;
    }
}

import com.estg.core.ItemType;
import com.estg.core.Measurement;
import com.estg.pickingManagement.Vehicle;
import com.estg.core.Container;
import java.awt.*;
import java.time.LocalDate;

public class MeuVeiculo implements Vehicle {
    private int tamArrayMax = 100;
    private static int proxId = 1;
    private int id;
    private ItemType type;
    private double capacidadeMax;
    private Container[] containers;
    private int numContainers;

    public MeuVeiculo(int capacidadeMax, ItemType type) {
        this.id = proxId++;
        this.capacidadeMax = capacidadeMax;
        this.setType(type);
        this.containers = new Container[tamArrayMax];
        this.numContainers = 0;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    @Override
    public ItemType getSupplyType() {
        return this.type;
    }

    @Override
    public double getMaxCapacity() {
        return this.capacidadeMax;
    }

    public double getPesoAtual(LocalDate localDate){
        double pesoTotal = 0;
        for(int i = 0; i < this.numContainers; i++){
            Measurement[] measurements = new Measurement[9];
            measurements = this.containers[i].getMeasurements(localDate);
            pesoTotal +=
        }
        return pesoTotal;
    }

    public void addContainer(Container container){
        if(container == null){
            System.out.println("Argumento inválido!");
        }
        if (this.getSupplyType() != container.getType()) {
            System.out.println("Este veículo não transporta container com este tipo de item");
            return;
        }

        if(this.numContainers == this.tamArrayMax){
            this.tamArrayMax = this.tamArrayMax*2;
            Container[] containers1 = new Container[this.tamArrayMax];
            for(int i = 0; i < this.numContainers; i++){
                containers1[i] = this.containers[i];
            }
            this.containers = containers1;
        }
        LocalDate localDate = LocalDate.now();
        double totalPeso = getPesoAtual(localDate) + container.getMeasurements(localDate);
        if(this.capacidadeMax == ){
        this.containers[this.numContainers] = container;
        numContainers++;
        }
    }
}

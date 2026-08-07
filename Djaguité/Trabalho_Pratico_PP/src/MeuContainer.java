import com.estg.core.Container;
import com.estg.core.ItemType;
import com.estg.core.Measurement;
import com.estg.core.exceptions.MeasurementException;

import java.time.LocalDate;

public class MeuContainer implements Container {

    private int tamMaxMedicao = 100;
    private static final String MEDICAO_INVALIDA = "MEDIÇÃO INVÁLIDA";
    private static int proxId = 1;
    private int id;
    private int numMed;
    private String codigo;
    private ItemType itemType;
    private double capacidadeMax;
    private Measurement[] medicoes;

    public MeuContainer(int id, String codigo, double capacidadeMax, ItemType itemType) {
        this.id = proxId++;
        this.numMed = 0;
        this.codigo = codigo;
        this.capacidadeMax = capacidadeMax;
        this.itemType = itemType;
        this.medicoes = new Measurement[tamMaxMedicao];
    }

    @Override
    public String getCode() {
        return this.codigo;
    }

    @Override
    public double getCapacity() {
        return this.capacidadeMax;
    }

    @Override
    public ItemType getType() {
        return this.itemType;
    }

    @Override
    public Measurement[] getMeasurements() {
        Measurement[] measurements = new Measurement[this.numMed];
        for(int i = 0; i < this.numMed; i++){
            measurements[i] = this.medicoes[i];
        }
        return measurements;
    }

    @Override
    public Measurement[] getMeasurements(LocalDate localDate) {

        if(localDate == null){
            System.out.println("Data inválida!");
            return new Medicao[0];
        }

        Measurement[] medicaos1 = new Measurement[this.numMed];
        int j = 0;
        for (int i = 0; i < this.numMed; i++){
            LocalDate dataMedicao = this.medicoes[i].getDate().toLocalDate();
            if(dataMedicao.equals(localDate)){
                medicaos1[j++] = this.medicoes[i];
            }
        }
        Measurement[] medicaoFinal = new Measurement[j];
        for(int k = 0; k < j; k++){
            medicaoFinal[k] = medicaos1[k];
        }

        return medicaoFinal;
    }

    @Override
    public boolean addMeasurement(Measurement measurement) throws MeasurementException {
        if(measurement == null){
            throw new MeasurementException(MEDICAO_INVALIDA);
        }
        if(this.numMed == this.tamMaxMedicao){
            this.tamMaxMedicao = this.tamMaxMedicao*2;
            Measurement[] measurements = new Measurement[this.tamMaxMedicao];
            for(int i = 0; i < this.numMed; i++){
                measurements[i] = this.medicoes[i];
            }
            this.medicoes = measurements;
        }
        this.medicoes[this.numMed] = measurement;
        numMed++;
        return true;
    }
}

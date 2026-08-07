import com.estg.core.Measurement;

import java.time.LocalDateTime;

public class Medicao implements Measurement {
    private LocalDateTime localDateTime;
    private double peso;

    public Medicao(double peso) {
        this.localDateTime = LocalDateTime.now();
        this.peso = peso;
    }

    @Override
    public LocalDateTime getDate() {
        return this.localDateTime;
    }

    @Override
    public double getValue() {
        return this.peso;
    }
}

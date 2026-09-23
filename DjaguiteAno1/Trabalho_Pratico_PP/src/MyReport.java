import com.estg.pickingManagement.Report;
import com.estg.pickingManagement.Route;

import java.time.LocalDateTime;

public class MyReport implements Report {
    private Route[] routes;
    private LocalDateTime dateTime;
    @Override
    public int getUsedVehicles() {
        return 0;
    }

    @Override
    public int getPickedContainers() {
        return 0;
    }

    @Override
    public double getTotalDistance() {
        return 0;
    }

    @Override
    public double getTotalDuration() {
        return 0;
    }

    @Override
    public int getNonPickedContainers() {
        return 0;
    }

    @Override
    public int getNotUsedVehicles() {
        return 0;
    }

    @Override
    public LocalDateTime getDate() {
        return null;
    }
}

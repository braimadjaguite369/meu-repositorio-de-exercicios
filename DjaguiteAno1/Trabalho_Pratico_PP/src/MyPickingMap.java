import com.estg.core.AidBox;
import com.estg.pickingManagement.PickingMap;
import com.estg.pickingManagement.Route;

import java.time.LocalDateTime;

public class MyPickingMap implements PickingMap {
    private AidBox[] aidBoxes;
    private Route[] routes;
    @Override
    public LocalDateTime getDate() {
        return null;
    }

    @Override
    public Route[] getRoutes() {
        return new Route[0];
    }
}

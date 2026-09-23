import com.estg.core.*;
import com.estg.core.exceptions.*;
import com.estg.pickingManagement.PickingMap;
import com.estg.pickingManagement.Vehicle;

import java.time.LocalDateTime;

public class MinhaInstitution implements Institution {
    private AidBox[] aidBoxes;
    private Vehicle[] vehicles;
    private PickingMap[] pickingMaps;
    @Override
    public String getName() {
        return "";
    }

    @Override
    public boolean addAidBox(AidBox aidBox) throws AidBoxException {
        return false;
    }

    @Override
    public boolean addMeasurement(Measurement measurement, Container container) throws ContainerException, MeasurementException {
        return false;
    }

    @Override
    public AidBox[] getAidBoxes() {
        return new AidBox[0];
    }

    @Override
    public Container getContainer(AidBox aidBox, ItemType itemType) throws ContainerException {
        return null;
    }

    @Override
    public Vehicle[] getVehicles() {
        return new Vehicle[0];
    }

    @Override
    public boolean addVehicle(Vehicle vehicle) throws VehicleException {
        return false;
    }

    @Override
    public void disableVehicle(Vehicle vehicle) throws VehicleException {

    }

    @Override
    public void enableVehicle(Vehicle vehicle) throws VehicleException {

    }

    @Override
    public PickingMap[] getPickingMaps() {
        return new PickingMap[0];
    }

    @Override
    public PickingMap[] getPickingMaps(LocalDateTime localDateTime, LocalDateTime localDateTime1) {
        return new PickingMap[0];
    }

    @Override
    public PickingMap getCurrentPickingMap() throws PickingMapException {
        return null;
    }

    @Override
    public boolean addPickingMap(PickingMap pickingMap) throws PickingMapException {
        return false;
    }

    @Override
    public double getDistance(AidBox aidBox) throws AidBoxException {
        return 0;
    }
}

import com.estg.core.AidBox;
import com.estg.pickingManagement.Route;
import com.estg.pickingManagement.Vehicle;
import com.estg.pickingManagement.exceptions.RouteException;

public class MeuRoute implements Route {
    private AidBox[] aidBoxes;
    private int numAidBox;
    private double totalDistances;
    private Vehicle vehicle;

    @Override
    public void addAidBox(AidBox aidBox) throws RouteException {

    }

    @Override
    public AidBox removeAidBox(AidBox aidBox) throws RouteException {
        return null;
    }

    @Override
    public boolean containsAidBox(AidBox aidBox) {
        return false;
    }

    @Override
    public void replaceAidBox(AidBox aidBox, AidBox aidBox1) throws RouteException {

    }

    @Override
    public void insertAfter(AidBox aidBox, AidBox aidBox1) throws RouteException {

    }

    @Override
    public AidBox[] getRoute() {
        return new AidBox[0];
    }

    @Override
    public Vehicle getVehicle() {
        return null;
    }

    @Override
    public double getTotalDistance() {
        return 0;
    }

    @Override
    public double getTotalDuration() {
        return 0;
    }
}

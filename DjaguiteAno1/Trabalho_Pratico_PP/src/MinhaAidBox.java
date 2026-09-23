import com.estg.core.AidBox;
import com.estg.core.Container;
import com.estg.core.GeographicCoordinates;
import com.estg.core.ItemType;
import com.estg.core.exceptions.AidBoxException;
import com.estg.core.exceptions.ContainerException;

public class MinhaAidBox implements AidBox {
    private int capaciddeMax;
    private int id;
    private String zona;
    private String codigo;
    private String refLocal;
    private GeographicCoordinates geographicCoordinates;
    private Container[] containers;
    private int numContainer;


    @Override
    public String getCode() {
        return this.codigo;
    }

    @Override
    public String getZone() {
        return zona;
    }

    @Override
    public String getRefLocal() {
        return refLocal;
    }

    @Override
    public double getDistance(AidBox aidBox) throws AidBoxException {
        return 0;
    }

    @Override
    public double getDuration(AidBox aidBox) throws AidBoxException {
        return 0;
    }

    @Override
    public GeographicCoordinates getCoordinates() {
        return null;
    }

    @Override
    public boolean addContainer(Container container) throws ContainerException {
        return false;
    }

    @Override
    public Container getContainer(ItemType itemType) {
        return null;
    }

    @Override
    public Container[] getContainers() {
        return new Container[0];
    }
}

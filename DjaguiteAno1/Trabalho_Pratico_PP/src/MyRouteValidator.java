import com.estg.core.AidBox;
import com.estg.pickingManagement.Route;
import com.estg.pickingManagement.RouteValidator;

public class MyRouteValidator implements RouteValidator {
    //Depende da route e de aidbox.
    @Override
    public boolean validate(Route route, AidBox aidBox) {
        return false;
    }
}

import com.estg.core.Institution;
import com.estg.pickingManagement.Route;
import com.estg.pickingManagement.RouteValidator;
import com.estg.pickingManagement.Strategy;

public class MyStrategy implements Strategy {
    //Aui há dependencia, precisa de instituição, e de rotevalidator.
    @Override
    public Route[] generate(Institution institution, RouteValidator routeValidator) {
        return new Route[0];
    }
}

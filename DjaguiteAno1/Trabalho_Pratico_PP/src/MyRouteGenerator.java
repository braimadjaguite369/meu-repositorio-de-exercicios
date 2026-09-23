import com.estg.core.Institution;
import com.estg.pickingManagement.*;

public class MyRouteGenerator implements RouteGenerator {
//Depende de instituição, strategy, routevalidater e report.
    @Override
    public Route[] generateRoutes(Institution institution, Strategy strategy, RouteValidator routeValidator, Report report) {
        return new Route[0];
    }
}

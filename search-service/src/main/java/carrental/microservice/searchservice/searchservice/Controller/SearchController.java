package carrental.microservice.searchservice.searchservice.Controller;



import carrental.microservice.searchservice.searchservice.Domain.User;
import carrental.microservice.searchservice.searchservice.Domain.Vehicle;
import carrental.microservice.searchservice.searchservice.Service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("search")
public class SearchController {

    @Autowired
    private SearchService searchService;



    @GetMapping("/{userId}")
    public User findByUserId(@PathVariable("userId") Long userId){

        return searchService.findByUserId(userId);
    }

    @GetMapping("userName/{userName}")
    public User findByUserName(@PathVariable("userName") String userName){

        return searchService.findByUserName(userName);
    }

    @GetMapping("vehicleType/{vehicleType}")
    public List<Vehicle> findByVehicleType(@PathVariable("vehicleType") String vehicleType){

        return searchService.findByVehicleType(vehicleType);
    }

    @GetMapping("vehicleType/{vehicleBrand}")
    public List<Vehicle> findByVehicleBrand(@PathVariable("vehicleBrand") String vehicleBrand){

        return searchService.findByVehicleBrand(vehicleBrand);
    }

    @GetMapping("vehicleType/{vehicleModel}")
    public List<Vehicle> findByVehicleModel(@PathVariable("vehicleModel") String vehicleModel){

        return searchService.findByVehicleModel(vehicleModel);
    }
}

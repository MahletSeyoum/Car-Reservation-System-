package carrental.microservice.searchservice.searchservice.Service;

import carrental.microservice.searchservice.searchservice.Domain.User;
import carrental.microservice.searchservice.searchservice.Domain.Vehicle;


import java.util.List;

public interface SearchService {

    User findByUserId(long userId);
    User findByUserName(String userName);
    List<Vehicle> findByVehicleType(String vehicleType);
    List<Vehicle> findByVehicleBrand(String vehicleBrand);
    List<Vehicle> findByVehicleModel (String vehicleModel);
}

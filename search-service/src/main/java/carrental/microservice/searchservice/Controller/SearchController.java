//package carrental.microservice.searchservice.Controller;
//
//import carrental.microservice.searchservice.Domain.User;
//import carrental.microservice.searchservice.Domain.Vehicle;
//import carrental.microservice.searchservice.Service.SearchService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
////("search")
//@RestController
//public class SearchController {
//
//    @Autowired
//    private SearchService searchService;
//
//    @Autowired
//    private VehicleProxy vehicleProxy;
//
//    @Autowired
//    private UserProxy userProxy;
//
//    @GetMapping("/{userId}")
//    public User findByUserId(@PathVariable("userId") Long userId){
//
//        User user = vehicleProxy.retrieveUserValue(userId);
//
//        return user;
//    }
//
//    @GetMapping("userName/{userName}")
//    public User findByUserName(@PathVariable("userName") String userName){
//
//        return searchService.findByUserName(userName);
//    }
//
//    @GetMapping("/vehicles/{id}")
//    public Vehicle findByVehicleId(@PathVariable("id") Long id){
//
//        Vehicle vehicle = userProxy.retrieveVehiclesById(id);
//
//        searchService.save(new Vehicle(vehicle.getId(),
//                vehicle.getYearOfManufacture(),
//                vehicle.getBrand(),
//               vehicle.getModel()));
//
//        //return new Vehicle(vehicle.getId(),vehicle.getYearOfManufacture(),vehicle.getBrand(),vehicle.getModel());
//        return vehicle;
//
//    }
//
//    @GetMapping("vehicleType/{yearOfManufacture}")
//    public List<Vehicle> findByVehicleType(@PathVariable("yearOfManufacture") String yearOfManufacture){
//
//        return searchService.findByVehicleType(yearOfManufacture);
//    }
//
//    @GetMapping("vehicleType/{brand}")
//    public List<Vehicle> findByVehicleBrand(@PathVariable("brand") String brand){
//
//        return searchService.findByVehicleBrand(brand);
//    }
//
//    @GetMapping("vehicleType/{model}")
//    public List<Vehicle> findByVehicleModel(@PathVariable("model") String model){
//
//        return searchService.findByVehicleModel(model);
//    }
//}

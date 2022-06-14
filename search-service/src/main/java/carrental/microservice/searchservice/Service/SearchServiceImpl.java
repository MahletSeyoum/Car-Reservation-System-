//package carrental.microservice.searchservice.Service;
//
//import carrental.microservice.searchservice.Domain.User;
//import carrental.microservice.searchservice.Domain.Vehicle;
//import carrental.microservice.searchservice.Repository.SearchRepository;
//import carrental.microservice.searchservice.Repository.VehicleRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//
//import java.util.List;
//
//@Service
//public class SearchServiceImpl implements SearchService{
//
//    @Autowired
//    private SearchRepository searchRepository;
//
//    @Autowired
//    private VehicleRepository vehicleRepository;
//
//    @Override
//    public Vehicle save(Vehicle vehicle) {
//        return vehicleRepository.save(vehicle);
//    }
//
//    @Override
//    public User findByUserId(long userId) {
//        return searchRepository.findById(userId).get();
//    }
//
//    @Override
//    public User findByUserName(String userName) {
//        return searchRepository.findByUserName(userName);
//    }
//
//    @Override
//    public List<Vehicle> findByVehicleType(String yearOfManufacture) {
//        return vehicleRepository.findByYearOfManufacture(yearOfManufacture);
//    }
//
//    @Override
//    public List<Vehicle> findByVehicleBrand(String brand) {
//        return vehicleRepository.findByBrand(brand);
//    }
//
//    @Override
//    public List<Vehicle> findByVehicleModel(String model) {
//        return vehicleRepository.findByModel(model);
//    }
//}

package carrental.microservice.searchservice.searchservice.Service;

import carrental.microservice.searchservice.searchservice.Repository.SearchRepository;
import carrental.microservice.searchservice.searchservice.Repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import carrental.microservice.searchservice.searchservice.Domain.Vehicle;
import carrental.microservice.searchservice.searchservice.Domain.User;

import java.util.List;

@Service
public class SearchServiceImpl implements SearchService{

    @Autowired
    private SearchRepository searchRepository;

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public User findByUserId(long userId) {
        return searchRepository.findById(userId).get();
    }

    @Override
    public User findByUserName(String userName) {
        return searchRepository.findByUserName(userName);
    }

    @Override
    public List<Vehicle> findByVehicleType(String vehicleType) {
        return vehicleRepository.findByVehicleType(vehicleType);
    }

    @Override
    public List<Vehicle> findByVehicleBrand(String vehicleBrand) {
        return vehicleRepository.findByVehicleBrand(vehicleBrand);
    }

    @Override
    public List<Vehicle> findByVehicleModel(String vehicleModel) {
        return vehicleRepository.findByVehicleModel(vehicleModel);
    }
}

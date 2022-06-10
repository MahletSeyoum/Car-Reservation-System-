package carrental.microservice.searchservice.searchservice.Repository;

import carrental.microservice.searchservice.searchservice.Domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
        List<Vehicle> findByVehicleType(String vehicleType);
        List<Vehicle> findByVehicleBrand(String vehicleBrand);
        List<Vehicle> findByVehicleModel(String VehicleModel);
}

package edu.miu.cs590.vehicleservice.repository;

import edu.miu.cs590.vehicleservice.domain.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends MongoRepository<Vehicle, String> {
    List<Vehicle> getByBrand(
            String brand
    );

    List<Vehicle> getByModel(
            String model
    );
}

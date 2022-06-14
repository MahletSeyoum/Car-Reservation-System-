package edu.miu.cs590.vehicleservice.repository;

import edu.miu.cs590.vehicleservice.domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    List<Vehicle> getByBrand(
            String brand
    );

    List<Vehicle> getByModel(
            String model
    );
}

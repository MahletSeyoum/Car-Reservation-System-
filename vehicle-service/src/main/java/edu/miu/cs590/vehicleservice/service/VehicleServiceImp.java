package edu.miu.cs590.vehicleservice.service;

import edu.miu.cs590.vehicleservice.domain.Vehicle;
import edu.miu.cs590.vehicleservice.repository.VehicleRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class VehicleServiceImp implements VehicleService{

    @Autowired
    private VehicleRepository vehicleRepository;


    @Override
    public List<Vehicle> getAllVehicle() {
        return vehicleRepository.findAll();
    }

    @Override
    public List<Vehicle> getVehicleByBrand(String brand) {
        return vehicleRepository.getByBrand(brand);
    }

    @Override
    public List<Vehicle> getVehicleByModel(String model) {
        return vehicleRepository.getByModel(model);
    }

    @Override
    public Vehicle getVehicleById(String vehicleId) {
        return vehicleRepository.findById(vehicleId).orElse(null);
    }

    @Override
    public Vehicle addVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle updateVehicle(String vehicleId , Vehicle vehicle) {
        if(vehicleRepository.findById(vehicleId).isPresent()){
            vehicle.setId(vehicleId);

            return vehicleRepository.save(vehicle);
        }
        return vehicleRepository.save(vehicle);
    }


    @Override
    public void deleteVehicle(String vehicleId) {
        vehicleRepository.deleteById(vehicleId);
    }
}

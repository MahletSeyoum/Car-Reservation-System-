package edu.miu.cs590.vehicleservice.service;

import edu.miu.cs590.vehicleservice.domain.Vehicle;
import edu.miu.cs590.vehicleservice.domain.VehicleStatus;
import edu.miu.cs590.vehicleservice.repository.VehicleRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
@NoArgsConstructor
@AllArgsConstructor
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
        return vehicleRepository.findById(vehicleId).get();
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

    @Override
    public void updateVehicleStatus(String vehicleId, VehicleStatus vehicleStatus) {
        Optional<Vehicle> vehicleOptional = vehicleRepository.findById(vehicleId);
        if(vehicleOptional.isPresent()){
            vehicleOptional.get().setVehicleStatus(vehicleStatus);
            vehicleRepository.save(vehicleOptional.get());
        }
    }
}

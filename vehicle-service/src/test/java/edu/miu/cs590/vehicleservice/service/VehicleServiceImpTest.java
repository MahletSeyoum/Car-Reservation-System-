package edu.miu.cs590.vehicleservice.service;

import edu.miu.cs590.vehicleservice.domain.Vehicle;
import edu.miu.cs590.vehicleservice.repository.VehicleRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static edu.miu.cs590.vehicleservice.domain.VehicleStatus.AVAILABLE;
import static edu.miu.cs590.vehicleservice.domain.VehicleType.SUV;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
public class VehicleServiceImpTest {

    @TestConfiguration
    static class VehicleServiceImplTestContextConfiguration {
        @Bean
        VehicleService getVehicleService() {
            return new VehicleServiceImp();
        }
    }

    @Autowired
    VehicleService vehicleService;

    @MockBean
    VehicleRepository vehicleRepository;

    @Before
    public void setUp() throws Exception {
        String vehicleId = "432";
        Vehicle vehicle = new Vehicle(vehicleId,"432","8765","Toyota","C2",
                "Red",4,"2021",SUV,AVAILABLE,
                20.2);
        Optional<Vehicle> optionalVehicle = Optional.of(vehicle);

        Mockito.when(vehicleRepository.findById(vehicleId)).thenReturn(optionalVehicle);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getVehicleByBrand() {
//        String vehicleBrand = "Tesla";
//        Vehicle vehicle = vehicleService.getVehicleByBrand(vehicleBrand);
//        assertEquals(vehicle.getBrand() , vehicleBrand);

    }

    @Test
    public void getVehicleById() {
        String vehicleId = "432";
        Vehicle vehicle = vehicleService.getVehicleById(vehicleId);

        assertEquals(vehicle.getId(), vehicleId);
    }
}
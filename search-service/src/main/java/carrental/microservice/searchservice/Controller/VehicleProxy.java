package carrental.microservice.searchservice.Controller;


import carrental.microservice.searchservice.Domain.SearchItem;
import carrental.microservice.searchservice.Domain.Vehicle;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "VEHICLE-SERVICE", url = "${VEHICLE-SERVICE_HOST:http://localhost}:9001")
public interface VehicleProxy {

    @GetMapping("vehicles/getvehicle/{id}")
    public SearchItem retrieveVehiclesById(
            @PathVariable("id") String id);

    @GetMapping("vehicles")
    public List<SearchItem> retrieveAllVehicles();

    @GetMapping("vehicles/getvehiclebybrand/{brand}")
    public List<SearchItem> retrieveVehiclesByBrand( @PathVariable("brand") String brand);

    @GetMapping("vehicles/getvehiclebymodel/{model}")
    public List<SearchItem> retrieveVehiclesByModel( @PathVariable("model") String model);



}
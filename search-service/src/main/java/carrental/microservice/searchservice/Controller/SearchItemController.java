package carrental.microservice.searchservice.Controller;

import carrental.microservice.searchservice.Domain.SearchItem;
import carrental.microservice.searchservice.Repository.SearchItemRepository;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class SearchItemController{

    @Autowired
    private SearchItemRepository searchItemRepository;

    @Autowired
    private VehicleProxy vehicleProxy;

    @GetMapping("/vehicles/{id}")
    @Cacheable(value = "vehicles",key = "#id")
    @Retry(name = "vehicles", fallbackMethod = "hardcodedResponsethird")
    public Optional<SearchItem> findVehicleById(@PathVariable String id){

        SearchItem item = vehicleProxy.retrieveVehiclesById(id);

      //  searchItemRepository.save(new SearchItem(item.getId(),item.getYearOfManufacture(),item.getBrand(),item.getModel(),item.getPrice(),item.getUserId(),item.getUserName()));
        System.out.println("going");
        return Optional.of(new SearchItem(item.getId(), item.getYearOfManufacture(), item.getBrand(), item.getModel(), item.getPrice(), item.getUserId(), item.getUserName()));

    }

    @GetMapping("/vehicles")
    @Retry(name = "vehicles", fallbackMethod = "hardcodedResponsesecond")
//    @Cacheable(value = "vehicles",key = "#test")
    public Iterable<SearchItem> findAllVehicles(){

        List<SearchItem> item = vehicleProxy.retrieveAllVehicles();

        for(SearchItem i : item){
            searchItemRepository
                    .save(new SearchItem(i.getYearOfManufacture(),i.getBrand(),i.getModel(),i.getUserId(),i.getUserName(),i.getPrice()));
        }

        Iterable<SearchItem> item2 =  searchItemRepository.findAll();

        return item2;
    }

    @GetMapping("/vehicles/getByBrand/{brand}")
    @Retry(name = "vehicles", fallbackMethod = "hardcodedResponse")
//    @CircuitBreaker(name = "default", fallbackMethod = "hardcodedResponse")
//    @Cacheable(value ="test", key = "#brand")
    public List<SearchItem> findAllVehiclesByBrand(@PathVariable String brand){

        List<SearchItem> item = vehicleProxy.retrieveVehiclesByBrand(brand);

//        for(SearchItem i : item){
//            searchItemRepository
//                    .save(new SearchItem(
//                            i.getYearOfManufacture(),i.getBrand(),i.getModel(),i.getUserId(),i.getUserName(),i.getPrice()));
//        }
        System.out.println("Caching");
        return item;
    }

    @GetMapping("/vehicles/getByModel/{model}")
    @Cacheable(value ="model", key = "#model")
    @Retry(name = "vehicles", fallbackMethod = "hardcodedResponse")
    public List<SearchItem> findAllVehiclesByModel(@PathVariable String model){

        List<SearchItem> item = vehicleProxy.retrieveVehiclesByModel(model);

//        for(SearchItem i : item){
//            searchItemRepository
//                    .save(new SearchItem(
//                            i.getYearOfManufacture(),i.getBrand(),i.getModel(),i.getUserId(),i.getUserName(),i.getPrice()));
//        }
        System.out.println("Caching");
        return item;
    }

    public List<SearchItem> hardcodedResponse(Exception ex) {
        System.out.println("Trying");
        return null;
    }

    public Iterable<SearchItem> hardcodedResponsesecond(Exception ex) {
        System.out.println("Trying");
        return null;
    }



    public Optional<SearchItem> hardcodedResponsethird(Exception ex) {
        System.out.println("Trying");
        return null;
    }

}

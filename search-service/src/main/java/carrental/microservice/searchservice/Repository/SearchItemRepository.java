package carrental.microservice.searchservice.Repository;

import carrental.microservice.searchservice.Domain.SearchItem;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
/*import org.springframework.data.jpa.repository.JpaRepository;*/
import org.springframework.stereotype.Repository;

import java.util.Optional;

//import java.util.Optional;

@Repository
public interface SearchItemRepository extends ElasticsearchRepository<SearchItem, Long> {

    Optional<SearchItem> findById(String Long);
}

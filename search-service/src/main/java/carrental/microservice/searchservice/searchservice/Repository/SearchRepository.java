package carrental.microservice.searchservice.searchservice.Repository;


import carrental.microservice.searchservice.searchservice.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SearchRepository extends JpaRepository<User, Long> {
     User findByUserName(String userName);
}

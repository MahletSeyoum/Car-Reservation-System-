package edu.miu.cs590.reservationservice.repository;

import edu.miu.cs590.reservationservice.domain.Reservation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends MongoRepository<Reservation, String> {
}

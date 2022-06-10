package edu.miu.cs590.reservationservice.repository;

import edu.miu.cs590.reservationservice.domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleReservation extends JpaRepository<Vehicle, Long> {
}

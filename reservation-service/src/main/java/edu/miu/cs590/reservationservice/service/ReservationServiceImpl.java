package edu.miu.cs590.reservationservice.service;

import edu.miu.cs590.reservationservice.controller.request.ReservationRequest;
import edu.miu.cs590.reservationservice.domain.*;
import edu.miu.cs590.reservationservice.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public Reservation addReservation(ReservationRequest reservationRequest, String accountId, Long vehicleId) {
//        Account account = restTemplate.getForObject("http://localhost:8080/api/v1/users/" + accountId, Account.class);
        Vehicle vehicle = restTemplate.getForObject("http://localhost:9001/vehicles/" + vehicleId, Vehicle.class);
        if(vehicle.getStatus()==Status.AVAILABLE) {
            Reservation reservation = new Reservation();
            reservation.setDuration(reservationRequest.getDuration());
            reservation.setAccountId(accountId);
            reservation.setPaymentType(reservationRequest.getPaymentType());
            reservation.setVehicle(reservationRequest.getVehicle());
//            reservation.setStatus(Status.RESERVED);
            reservation.getVehicle().setVehicleId(vehicleId);
            reservationRequest.getVehicle().setStatus(Status.RESERVED);
            return reservationRepository.save(reservation);
        }
        else
            System.out.println("Vehicle is not available");
        return null;
    }

    @Override
    public void cancelReservation(Long reservationId) {
        Optional<Reservation> optionalReservation = reservationRepository.findById(reservationId);
        if(!optionalReservation.isPresent()) {
            System.out.println("Reservation does not exist");
        }
        else{
            Reservation reservation = optionalReservation.get();
            reservation.getVehicle().setStatus(Status.AVAILABLE);
            reservationRepository.deleteById(reservationId);
        }
    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation getReservationById(Long reservationId) {
        return reservationRepository.findById(reservationId).get();
    }

    @Override
    public Reservation updateStatus(Long reservationId, Status status) {
        Reservation reservation= reservationRepository.findById(reservationId).get();
//        reservation.setStatus(status);
        return reservation;
    }

    @Override
    public String pay(PaymentRequest paymentRequest) {
        Optional<Reservation> optionalReservation = reservationRepository.findById(paymentRequest.getReservationId());
        if (optionalReservation.isPresent()) {
            System.out.println("No Reservation Found by id: " + paymentRequest.getReservationId());
            return "Reservation is Not Successful";
        }

        Double price = optionalReservation.get().getVehicle().getPrice();

        LocalDate startDate = optionalReservation.get().getDuration().getRentalDate();
        LocalDate endDate = optionalReservation.get().getDuration().getReturnDate();
        Double days = (double) ChronoUnit.DAYS.between(startDate, endDate);
        Double totalPrice = price * days;
        paymentRequest.setTotalPrice(totalPrice);
        paymentRequest.setPaymentStatus(PaymentStatus.PENDING);

        PaymentRequest paymentRequest1 = restTemplate.getForObject("http://PAYMENT-SERVICE/payments", PaymentRequest.class);

        if(paymentRequest1.getPaymentStatus() == PaymentStatus.PAID){
            return "Payment processed successfully, reservation confirmed!";
        } else {
            return "Payment request failed, please try again!";
        }
    }


    }



package edu.miu.cs590.reservationservice.service;

import edu.miu.cs590.reservationservice.domain.*;
import edu.miu.cs590.reservationservice.dto.Account;
import edu.miu.cs590.reservationservice.dto.PaymentType;
import edu.miu.cs590.reservationservice.dto.Vehicle;
import edu.miu.cs590.reservationservice.repository.ReservationRepository;
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
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
public class ReservationServiceImplTest {

    @TestConfiguration
    static class ReservationServiceImplContextConfiguration {

        @Bean
        ReservationService getReservationService() {

            return new ReservationServiceImpl();
        }
    }

    @Autowired
    ReservationServiceImpl reservationService;

    @MockBean
    RestTemplate restTemplate;

    @MockBean
    ReservationRepository reservationRepository;

    @Before
    public void setUp() throws Exception {
        String reservationId = "123";
        Vehicle vehicle = new Vehicle();
        Duration duration = new Duration();
        Account account = new Account();
        Reservation reservation = new Reservation(reservationId, ReservationStatus.RESERVED, account, duration, PaymentType.BANK,vehicle);
        Optional<Reservation> optionalReservation = Optional.of(reservation);

        Mockito.when(reservationRepository.findById(reservationId)).thenReturn(optionalReservation);
//        Mockito.when(reservationRepository.findId(reservationId)).thenReturn(optionalReservation);

    }


    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testAddReservation() {
    }

    @Test
    public void testCancelReservation() {

    }

    @Test
    public void testGetAllReservations() {

    }

    @Test
    public void testGetReservationById() {
        String reservationId = "123";
        Reservation reservation = reservationService.getReservationById(reservationId);

        assertThat(reservation.getId())
                .isEqualTo(reservationId);

    }

    @Test
    public void testPay() {
    }
}
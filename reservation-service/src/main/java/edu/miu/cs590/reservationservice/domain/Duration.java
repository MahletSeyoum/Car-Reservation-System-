package edu.miu.cs590.reservationservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

//@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Duration {
    private LocalDate rentalDate;
    private LocalDate returnDate;
}

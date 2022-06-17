package com.titan.accountservice.VO.reservation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

//@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor

public class DurationVO {
    private LocalDate rentalDate;
    private LocalDate returnDate;
}

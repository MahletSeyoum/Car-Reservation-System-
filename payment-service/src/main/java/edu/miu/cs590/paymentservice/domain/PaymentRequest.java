package edu.miu.cs590.paymentservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String paymentType;
    private String reservationId;
    private String userId;
    private Double price;
    private PaymentStatus paymentStatus;

    @Override
    public String toString() {
        return "PaymentRequest{" +
                "id=" + id +
                ", paymentType='" + paymentType + '\'' +
                ", reservationId='" + reservationId + '\'' +
                ", userId='" + userId + '\'' +
                ", price=" + price +
                ", paymentStatus=" + paymentStatus +
                '}';
    }
}

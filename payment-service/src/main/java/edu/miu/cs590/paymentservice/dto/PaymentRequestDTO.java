package edu.miu.cs590.paymentservice.dto;


import edu.miu.cs590.paymentservice.domain.PaymentStatus;

public class PaymentRequestDTO {
    private String paymentType;
    private String reservationId;
    private String userId;
    private PaymentStatus paymentStatus;

    public PaymentRequestDTO(String paymentType, String reservationId, String userId,PaymentStatus paymentStatus) {
        this.paymentType = paymentType;
        this.reservationId = reservationId;
        this.userId = userId;
        this.paymentStatus=paymentStatus;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "PaymentRequestDTO{" +
                "paymentType='" + paymentType + '\'' +
                ", reservationId='" + reservationId + '\'' +
                ", userId='" + userId + '\'' +
                ", paymentStatus=" + paymentStatus +
                '}';
    }
}

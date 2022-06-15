package edu.miu.cs590.notificationservice.domain;


public class PaymentRequest {

    private String paymentType;
    private String reservationId;
    private String userId;
    private PaymentStatus paymentStatus;

    public PaymentRequest(String paymentType, String reservationId, String userId,PaymentStatus paymentStatus) {
        this.paymentType = paymentType;
        this.reservationId = reservationId;
        this.userId = userId;
        this.paymentStatus=paymentStatus;
    }

    public PaymentRequest() {
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
        return "PaymentRequest{" +
                "paymentType='" + paymentType + '\'' +
                ", reservationId='" + reservationId + '\'' +
                ", userId='" + userId + '\'' +
                ", paymentStatus=" + paymentStatus +
                '}';
    }
}

package edu.miu.cs590.notificationservice.domain;


public class PaymentRequest {

    private String paymentType;
    private String userId;

    public PaymentRequest(String paymentType,String userId) {
        this.paymentType = paymentType;
        this.userId = userId;
    }

    public PaymentRequest() {

    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString(){
        return "User with id "+ userId + " has successfully reserved a vehicle with "+paymentType+ " payment!";
    }
}

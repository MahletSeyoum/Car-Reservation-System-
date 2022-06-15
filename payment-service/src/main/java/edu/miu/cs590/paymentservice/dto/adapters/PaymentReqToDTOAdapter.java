package edu.miu.cs590.paymentservice.dto.adapters;

import edu.miu.cs590.paymentservice.domain.PaymentRequest;
import edu.miu.cs590.paymentservice.dto.PaymentRequestDTO;

public class PaymentReqToDTOAdapter {

    public static PaymentRequestDTO createPaymentRequestDTO(PaymentRequest request){
        PaymentRequestDTO paymentRequestDTO=new PaymentRequestDTO();
        paymentRequestDTO.setUserId(request.getUserId());
        paymentRequestDTO.setPaymentType(request.getPaymentType());
        return paymentRequestDTO;
    }

}

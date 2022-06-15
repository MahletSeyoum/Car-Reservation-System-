package edu.miu.cs590.paymentservice.repository;

import edu.miu.cs590.paymentservice.domain.PaymentRequest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends MongoRepository<PaymentRequest, String> {
}

package edu.miu.cs590.paymentservice.repository;

import edu.miu.cs590.paymentservice.domain.PaymentRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentRequest, Long> {
}

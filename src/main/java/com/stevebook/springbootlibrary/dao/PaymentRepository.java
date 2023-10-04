package com.stevebook.springbootlibrary.dao;

import com.stevebook.springbootlibrary.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PaymentRepository extends JpaRepository<Payment, Long> {

    Payment findPaymentsByUserEmail (String userEmail);

}

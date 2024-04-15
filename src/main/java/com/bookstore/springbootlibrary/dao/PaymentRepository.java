package com.bookstore.springbootlibrary.dao;

import com.bookstore.springbootlibrary.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

    Payment findByUserEmail(@Param("user_email") String userEmail);
}

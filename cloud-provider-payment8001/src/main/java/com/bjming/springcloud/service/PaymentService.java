package com.bjming.springcloud.service;

import com.bjming.springcloud.entities.Payment;

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}

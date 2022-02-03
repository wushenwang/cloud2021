package org.vbaicai.springcloud.service;

import org.apache.ibatis.annotations.Param;
import org.vbaicai.springcloud.entity.Payment;

public interface PaymentService {
    Integer create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}

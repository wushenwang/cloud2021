package org.vbaicai.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.vbaicai.springcloud.entity.Payment;

@Mapper
public interface PaymentDao {


    Integer create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}

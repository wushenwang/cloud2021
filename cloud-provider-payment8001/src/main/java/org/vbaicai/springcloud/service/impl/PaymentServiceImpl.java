package org.vbaicai.springcloud.service.impl;

import org.springframework.stereotype.Service;
import org.vbaicai.springcloud.dao.PaymentDao;
import org.vbaicai.springcloud.entity.Payment;
import org.vbaicai.springcloud.service.PaymentService;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public Integer create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

}


package org.vbaicai.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.vbaicai.springcloud.entity.CommonResult;
import org.vbaicai.springcloud.entity.Payment;
import org.vbaicai.springcloud.service.PaymentService;

import javax.annotation.Resource;


    @RestController
    @Slf4j
    public class    PaymentController {

        @Resource
        private PaymentService paymentService;

        @PostMapping("/payment")
        public CommonResult<Integer> create(@RequestBody Payment payment) {
            Integer res = paymentService.create(payment);
            if (res == 0) {
                return new CommonResult<>(500, "插入数据库失败!", null);
            }
            return new CommonResult<>(200, "插入数据库成功!", res);
        }

        @GetMapping("/payment/{id}")
        public CommonResult<Payment> getPaymentById(@PathVariable Long id) {
            Payment payment = paymentService.getPaymentById(id);
            if (payment == null) {
                return new CommonResult<>(404, "查询不存在!", null);
            }
            return new CommonResult<>(200, "查询成功!", payment);
        }
    }



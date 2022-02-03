package org.vbaicai.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.vbaicai.springcloud.entity.CommonResult;
import org.vbaicai.springcloud.entity.Payment;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {
    public static final String PAYMENT_URL = "http://localhost:8001";
    @Resource
    private RestTemplate restTemplate;
    @GetMapping("/consumer/payment")
    public CommonResult<Payment> create( Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/",payment,CommonResult.class);
    }
    @GetMapping("/consumer/payment/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        System.out.println(id);
        return restTemplate.getForObject(PAYMENT_URL+"/payment/"+id, CommonResult.class);
    }

}

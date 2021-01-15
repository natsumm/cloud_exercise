package com.bjming.springcloud.controller;

import com.bjming.springcloud.entities.CommonResult;
import com.bjming.springcloud.entities.Payment;
import com.bjming.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        log.debug("创建订单开始, payment: "+payment);
        int result=paymentService.create(payment);
        if(result>0){
            log.debug("创建订单结束, result: "+result);
            return new CommonResult(200, "插入记录成功, serverPort==> "+serverPort, result);
        }else{
            return new CommonResult(400, "插入记录失败");
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable(value = "id") Long id){
        log.debug("查询订单开始, id: "+id);

        Payment payment=paymentService.getPaymentById(id);
        if(payment!=null){
            log.debug("查询订单结束, id: "+id +", payment: "+payment);
            return new CommonResult(200, "查询订单成功==> "+serverPort, payment);
        }else{
            log.debug("查询订单结束, id: "+id +", payment: "+payment);
            return new CommonResult(400, "查询订单失败, id: "+id);
        }
    }

}

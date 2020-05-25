package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author JiangBin
 * @create 2020-05-25 10:25
 * implement methods ^+i(快捷键)
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}

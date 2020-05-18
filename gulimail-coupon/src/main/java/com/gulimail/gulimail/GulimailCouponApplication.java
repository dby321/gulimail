package com.gulimail.gulimail;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.gulimail.gulimail.coupon.dao")
@SpringBootApplication
public class GulimailCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run ( GulimailCouponApplication.class, args );
    }

}

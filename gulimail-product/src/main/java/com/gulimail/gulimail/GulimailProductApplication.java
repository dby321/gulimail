package com.gulimail.gulimail;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// 整合mybatis-plus
@MapperScan("com.gulimail.gulimail.product.dao")
@SpringBootApplication
public class GulimailProductApplication {

    public static void main(String[] args) {
        SpringApplication.run ( GulimailProductApplication.class, args );
    }

}

package com.gulimail.gulimail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.gulimail.gulimail.member.feign")
@SpringBootApplication
public class GulimailMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run ( GulimailMemberApplication.class, args );
    }

}

package com.pullinglobal.gatewayservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;


@SpringBootApplication
public class GatewayServiceApplication {




    public static void main(String[] args) {



        System.out.println("log ferhat");



        SpringApplication.run(GatewayServiceApplication.class, args);

    }


}

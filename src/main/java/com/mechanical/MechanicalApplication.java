package com.mechanical;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.mechanical.mapper")
public class MechanicalApplication {

    public static void main(String[] args) {
        SpringApplication.run(MechanicalApplication.class, args);
    }

}

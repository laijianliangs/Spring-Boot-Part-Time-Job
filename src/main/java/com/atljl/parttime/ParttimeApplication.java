package com.atljl.parttime;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.atljl.parttime.mapper")
@SpringBootApplication
public class ParttimeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParttimeApplication.class, args);
    }

}

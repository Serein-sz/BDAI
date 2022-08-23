package com.serein.bdai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.tedu.boot.dao")
public class BdaiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BdaiApplication.class, args);
    }

}

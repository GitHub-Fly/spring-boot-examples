package io.ymq.mybatis.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = {"io.ymq.mybatis"})
public class Startup {

    public static void main(String[] args) {
        SpringApplication.run(Startup.class, args);
    }

}
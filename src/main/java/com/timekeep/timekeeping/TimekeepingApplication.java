package com.timekeep.timekeeping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class TimekeepingApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimekeepingApplication.class, args);
    }

}

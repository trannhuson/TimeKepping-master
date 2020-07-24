package com.timekeep.timekeeping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD

@SpringBootApplication
=======
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
>>>>>>> add files
public class TimekeepingApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimekeepingApplication.class, args);
    }

}

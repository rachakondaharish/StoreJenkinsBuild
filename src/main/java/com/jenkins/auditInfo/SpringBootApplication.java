package com.jenkins.auditInfo;

/**
 * The main Spring Boot Application
 *
 * Author hema madhuri
 * Date   11/5/18
 */

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

// same as @Configuration + @ComponentScan + @EnableAutoConfiguration
@SpringBootApplication
@ComponentScan("com.jenkins.auditInfo")
public class SpringBootApplication {

    /**
     * The main entry point of the application
     *
     * @param args
     * @throws Exception
     */
    public static void main (String [] args) throws Exception {
        SpringApplication.run(PasswordApplication.class, args);
    }
}
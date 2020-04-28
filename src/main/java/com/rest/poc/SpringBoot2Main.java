package com.rest.poc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot2Main {
    
    private static Logger LOG = LoggerFactory.getLogger(SpringBoot2Main.class);
    
    public static void main(String[] args) {
        LOG.info("SpringBoot2 Application is Starting...");
        try {
            SpringApplication.run(SpringBoot2Main.class, args);
        } catch (Exception e) {
            LOG.error("Error occurred while starting SpringBoot2FileUpload");
        }
        LOG.info("SpringBoot2FileUpload Application Started..");

    }
}
package com.ddlab.rnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class ConfigServer1 {

	public static void main(String[] args) {
        SpringApplication.run(ConfigServer1.class, args);
    }


}

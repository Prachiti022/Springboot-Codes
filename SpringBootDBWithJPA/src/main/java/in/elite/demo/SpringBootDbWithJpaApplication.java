package in.elite.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication(scanBasePackages = {
		"in.elite.controller", 
		"in.elite.entity", 
		"in.elite.service", 
		"in.elite.dao"})

@EntityScan(basePackages = "in.elite.entity")

@EnableJpaRepositories(basePackages = "in.elite.dao")

public class SpringBootDbWithJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDbWithJpaApplication.class, args);
    }
}


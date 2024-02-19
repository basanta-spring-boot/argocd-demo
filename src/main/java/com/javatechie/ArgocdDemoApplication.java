package com.javatechie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ArgocdDemoApplication {

    @GetMapping("/greetings")
    public String greetings() {
        return "Congratulations !! Your Application successfully deployed to K8S cluster !";
    }

    public static void main(String[] args) {
        SpringApplication.run(ArgocdDemoApplication.class, args);
    }

}

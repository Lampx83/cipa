package com.cipa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootApplication {

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);
  //  DialogFlowApp dialogFlowApp = context.getBean(DialogFlowApp.class);

  }

  @GetMapping("/")
  public String hello() {
    return "Hello, I am CIPA";
  }

}

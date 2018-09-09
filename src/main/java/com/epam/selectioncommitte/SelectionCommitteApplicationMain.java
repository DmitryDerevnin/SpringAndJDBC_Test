package com.epam.selectioncommitte;

import com.epam.services.demo.Demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.epam.repository"})
@ComponentScan({"com.epam.services"})
@ComponentScan({"com.epam.configurations"})
public class SelectionCommitteApplicationMain {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SelectionCommitteApplicationMain.class, args);
        Demo demo = context.getBean(Demo.class);
        demo.start();
    }
}

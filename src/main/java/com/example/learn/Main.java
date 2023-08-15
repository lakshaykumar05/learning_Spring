package com.example.learn;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // ApplicationContext context = new ClassPathXmlApplicationContext("com/example/learn/config.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        Employee e1 = (Employee)context.getBean("e1");

        System.out.println(e1);
    }
}
package com.example.learn;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext context = new ClassPathXmlApplicationContext("com/example/learn/config.xml");

        Employee e1 = (Employee)context.getBean("e1");

        System.out.println(e1);

        // Address a1 = (Address)context.getBean("a1");
        // System.out.println(a1);
    }
}
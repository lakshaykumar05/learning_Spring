package com.example.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("e1")
public class Employee {

    @Value("lakshay")
    private String name;
    
    @Value("123")
    private int id;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + "]";
    }
    public void setId(int id) {
        this.id = id;
    }

    
    
}

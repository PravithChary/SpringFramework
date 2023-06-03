package org.example.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Shop {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                '}';
    }

    // Using annotations
    @PostConstruct
    public void start(){
        System.out.println("Going to shop");
    }

    @PreDestroy
    public void end(){
        System.out.println("Going from shop");
    }
}

package org.example.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("refconfig.xml");
        A temp = (A) context.getBean("aref");

        System.out.println(temp.getX());
        System.out.println(temp.getOb().getY());
    }
}

package org.example.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autoannotationconfig.xml");
        // Instead of type casting
        Emp emp = context.getBean("emp1", Emp.class);
        System.out.println(emp);
    }
}

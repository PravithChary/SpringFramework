package org.example.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("standalonecollectionconfig.xml");
        Person person1 = context.getBean("person1", Person.class);
        System.out.println(person1);
        System.out.println(person1.getFriends().getClass().getName());

        System.out.println("-------------------------");
        System.out.println(person1.getFees());
        System.out.println(person1.getFees().getClass().getName());

        System.out.println("-------------------------");
        System.out.println(person1.getProperties());
        System.out.println(person1.getProperties().getClass().getName());
    }
}

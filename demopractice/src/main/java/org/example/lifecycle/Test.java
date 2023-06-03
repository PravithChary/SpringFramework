package org.example.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        // ApplicationContext is changed into AbstractApplicationContext to call context.registerShutdownHook();
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycleconfig.xml");
        // must be called explicitly to register shut down hook
        context.registerShutdownHook();
        Samosa samosa = (Samosa) context.getBean("s1");
        System.out.println(samosa);
        Pepsi pepsi = (Pepsi) context.getBean("p1");
        System.out.println(pepsi);
        Shop shop = (Shop) context.getBean("shop1");
        System.out.println(shop);

    }
}

package org.example.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Pepsi() {
        super();
    }

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }

    public void afterPropertiesSet() throws Exception {
        // init
        System.out.println("Now in init: Taking pepsi.");
    }

    public void destroy() throws Exception {
        // destroy
        System.out.println("Now in destroy: Throwing the pepsi.");
    }
}

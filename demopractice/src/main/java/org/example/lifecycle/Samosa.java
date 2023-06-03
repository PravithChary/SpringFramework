package org.example.lifecycle;

import org.omg.CosNaming.BindingIterator;

public class Samosa {
    private double price;

    public double getPrice() {
        System.out.println("Getting price!");
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting price!");
        this.price = price;
    }

    public Samosa() {
        super();
        System.out.println("Super is called!");
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public void hey(){
        System.out.println("Init is called! Hi, How are you?");
    }

    public void bye(){
        System.out.println("Destroy is called! Bye bye, I'm dying.");
    }
}

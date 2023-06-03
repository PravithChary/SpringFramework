package org.example.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
    @Autowired
    @Qualifier ("temp1 ")
    private Address address;

    public Address getAddress() {
        return address;
    }

    // @Autowired
    public void setAddress(Address address) {
        this.address = address;
        System.out.println("Inside setter");
    }

    public Emp() {
        super();
    }

    // @Autowired
    public Emp(Address address) {
        this.address = address;
        System.out.println("Inside constructor");
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}

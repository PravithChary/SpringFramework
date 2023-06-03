package org.example;

import java.sql.SQLOutput;

public class Student {
    private int rollNum;
    private String name;
    private String address;

    public int getRollNum() {
        System.out.println("Getting student roll number");
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        System.out.println("Setting student roll number");
        this.rollNum = rollNum;
    }

    public String getName() {
        System.out.println("Getting student name");
        return name;
    }

    public void setName(String name) {
        System.out.println("Setting student name");
        this.name = name;
    }

    public String getAddress() {
        System.out.println("Getting student address");
        return address;
    }

    public void setAddress(String address) {
        System.out.println("Setting student address");
        this.address = address;
    }

    public Student(int rollNum, String name, String address) {
        this.rollNum = rollNum;
        this.name = name;
        this.address = address;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student [" +
                "rollNum=" + rollNum +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                "]";
    }
}

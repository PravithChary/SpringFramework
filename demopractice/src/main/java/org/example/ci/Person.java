package org.example.ci;

import java.util.List;

public class Person {
    private String name;
    private int personId;
    private Certi certi;
    private List<String> list;

    public Person(String name, int personId, Certi certi, List <String> list){
        this.name = name;
        this.personId = personId;
        this.certi = certi;
        this.list = list;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personId=" + personId +
                ", certi=" + certi +
                ", list=" + list +
                '}';
    }
}

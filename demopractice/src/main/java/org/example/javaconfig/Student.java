package org.example.javaconfig;

import org.springframework.stereotype.Component;

//@Component("firststudent")
public class Student {
    private Samosa samosa;

    public Student(Samosa samosa) {
        this.samosa = samosa;
    }

    public Samosa getSamosa() {
        return samosa;
    }

    public void setSamosa(Samosa samosa) {
        this.samosa = samosa;
    }

    public void study(){
        this.samosa.display();
        System.out.println("Student is studying");
    }
}

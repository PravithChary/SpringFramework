package org.example.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("stereoconfig.xml");
        Student student = con.getBean("temp", Student.class);
        System.out.println(student);
        System.out.println(student.getAddress());
        System.out.println(student.getAddress().getClass().getName());
        System.out.println(student.hashCode());
        Student student2 = con.getBean("temp", Student.class);
        System.out.println(student2.hashCode());
//        Teacher teacher = con.getBean("teacher", Teacher.class);
//        System.out.println(teacher.hashCode());
//        Teacher teacher2 = con.getBean("teacher", Teacher.class);
//        System.out.println(teacher2 .hashCode());
    }
}

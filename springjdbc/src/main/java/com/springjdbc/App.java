package com.springjdbc;
import java.util.*;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.dao.StudentDaoImpl;
import com.springjdbc.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
    public static void main(String[] args) {
        System.out.println("My program started............");
        Scanner sc= new Scanner(System.in);
        // spring jdbc -> JDBC Template
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        StudentDao studentDao = context.getBean("StudentDao", StudentDao.class);

        // Inserting
        /*
        Student student = new Student();
        student.setId(64);
        student.setName("Ranjitha");
        student.setCity("Benagaluru");

        int result = studentDao.insert(student);

        System.out.println("Student added...."+result);*/

        // Updating
        /*
        Student student = new Student();
        student.setId(64);
        student.setName("Rahul");
        student.setCity("Pune");
        int result = studentDao.change(student);
        System.out.println("Student updated....." + student.getId());*/

        // Deleting
        /*
        int studentId= sc.nextInt();
        int result = studentDao.delete(studentId);
        System.out.println("Student deleted......."+ result);*/

        // Selecting single row
        /*
        Student student = studentDao.getStudent(222);
        System.out.println(student);*/

        // Selecting all rows
        List<Student> students = studentDao.getAllStudents();
        for(Student s:students){
            System.out.println(s);
        }
    }
}

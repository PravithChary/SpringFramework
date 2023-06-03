package org.example.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.javaconfig")
public class JavaConfig {
    @Bean
    public Samosa getSamosa(){
        return new Samosa();
    }
    @Bean(name = {"pravith","raju"})
    public Student getStudent(){
        Student student = new Student(getSamosa() );
        return student;
    }
}

package com.springjdbc.dao;
import com.springjdbc.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class StudentDaoImpl implements StudentDao{
    private JdbcTemplate jdbcTemplate;
    public int insert(Student student) {
        // insert query
        String query = "insert into student(id, name, city) values(?,?,?)";
        int result = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
        return result;
    }

    public int change(Student student) {
        // update query
        String query = "update student set name=? , city =? where id=?";
        int result = this.jdbcTemplate.update(query, student.getName(),student.getCity(), student.getId());
        return result;
    }

    public int delete(int studentId) {
        // delete query
        String query = "delete from student where id=?";
        int result = this.jdbcTemplate.update(query, studentId);
        return result;
    }

    public Student getStudent(int studentId) {
        // select single row
        String query = "select * from student where id=?";
        RowMapper<Student> rowMapper = new RowMapperImpl();
        Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
        return student;
    }

    public List<Student> getAllStudents() {
        // selecting all the rows
        String query = "select * from student";
        RowMapper<Student> rowMapper = new RowMapperImpl();
        List<Student> students = this.jdbcTemplate.query(query,rowMapper);
        return students;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}

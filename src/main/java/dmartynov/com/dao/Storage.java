package dmartynov.com.dao;

import dmartynov.com.model.Student;

import java.util.List;

public interface Storage {
    void removeAll();


    void removeStudent(int id);


    void removeStudentByName(String name);


    void addStudent(Student Student);


    void updateStudent(Student Student);


    Student getStudent(int id);


    List< Student > getAllStudent();
}

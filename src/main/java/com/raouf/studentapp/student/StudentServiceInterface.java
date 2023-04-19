package com.raouf.studentapp.student;

import java.util.List;

public interface StudentServiceInterface {
    List<Student> findAllStudents();

    Student save(Student s);

    Student findStudent(String email);

    Student update(Student s);

    void delete(String email);
}

package com.raouf.studentapp.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryStudentService implements StudentServiceInterface{
    private final InMemoryStudentDao dao;

    public InMemoryStudentService(InMemoryStudentDao dao) {
        this.dao = dao;
    }
    public List<Student> findAllStudents() {
            return dao.findAllStudents();
    }

    @Override
    public Student save(Student s) {
        return dao.save(s);
    }

    @Override
    public Student findStudent(String email) {
        return dao.findStudent(email);
    }

    @Override
    public Student update(Student s) {
        return dao.update(s);
    }

    @Override
    public void delete(String email) {
        dao.delete(email);
    }
}

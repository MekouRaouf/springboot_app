package com.raouf.studentapp.student;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private StudentServiceInterface service;

    public StudentController(StudentServiceInterface service) {
        this.service = service;
    }

    @PostMapping
    public Student save(@RequestBody Student s){
        return service.save(s);
    }

    @GetMapping
    public List<Student> findAllStudents(){
        return service.findAllStudents();
    }

    @GetMapping("/{email}")
    public Student findStudent(@PathVariable String email){
        return service.findStudent(email);
    }

    @PutMapping
    public Student update(@RequestBody Student s){
        return service.update(s);
    }

    @DeleteMapping("/{email}")
    public void delete(@PathVariable String email){
        service.delete(email);
    }

}

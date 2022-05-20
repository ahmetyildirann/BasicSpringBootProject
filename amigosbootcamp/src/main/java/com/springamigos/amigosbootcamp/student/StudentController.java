package com.springamigos.amigosbootcamp.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/building")
public class StudentController {

    private final StudentService studentService; // autowired tan sonra bu constructra injecte edilecek 2

    @Autowired //biz StudentService in otomatik olarak bağlanmasını istiyoruz demek bu 1
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping //
    public List<Student> getStudent(){

        return studentService.getStudent();

    }

}

package com.dh.project.demo.web;

import com.dh.project.demo.domain.Student;
import com.dh.project.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Cristhian on 19/05/2017.
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired//Inyeccion de dependencias
    StudentService studentService;
    @RequestMapping(method = RequestMethod.GET  )
    public List<Student> getStudent(){
        return studentService.getAllStudents();
    }
}

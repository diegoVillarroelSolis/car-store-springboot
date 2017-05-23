package com.dh.project.demo.web;

import com.dh.project.demo.domain.Student;
import com.dh.project.demo.service.StudentService;
import io.swagger.annotations.Api;
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
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
public class StudentController {
    @Autowired//Inyeccion de dependencias
    StudentService studentService;
    @RequestMapping(method = RequestMethod.GET  )
    public List<Student> getStudent(){
        return studentService.getAllStudents();
    }
}

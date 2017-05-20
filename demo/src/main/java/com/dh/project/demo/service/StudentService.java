package com.dh.project.demo.service;

import com.dh.project.demo.domain.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cristhian on 19/05/2017.
 */
@Service
public class StudentService {
    public List<Student> getAllStudents(){
        List<Student> listStudents = new ArrayList<>();
        listStudents.add(new Student(1, "Juan"));
        listStudents.add(new Student(1, "Pedro"));
        listStudents.add(new Student(1, "Rocio"));
        return listStudents;
    }
}

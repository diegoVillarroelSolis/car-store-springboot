package com.dh.project.demo.service;

import com.dh.project.demo.domain.Teacher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cristhian on 19/05/2017.
 */
@Service
public class TeacherService {
    public List<Teacher> getAllTeachers(){
        List<Teacher> listTeacher = new ArrayList<>();
        listTeacher.add(new Teacher(1, "Jhonny"));
        listTeacher.add(new Teacher(1, "Gabo"));
        listTeacher.add(new Teacher(1, "Javier"));
        return listTeacher;
    }
}

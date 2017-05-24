package com.dh.project.demo.service;

import com.dh.project.demo.Repository.TeacherRepository;
import com.dh.project.demo.domain.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cristhian on 19/05/2017.
 */
@Service
public class TeacherService {
    @Autowired
    TeacherRepository teacherRepository;
    public List<Teacher> getAllTeachers(){
        return teacherRepository.findAll();
    }

    public void addTeacher(Teacher newTeacher){
        teacherRepository.save(newTeacher);
    }

    public Teacher getTeacherByID(String id){
        return teacherRepository.findOne(id);
    }

    public void updateTeacher(String id, Teacher updatedTeacher){
        Teacher teacher = teacherRepository.findOne(id);
        teacher.setName(updatedTeacher.getName());
        teacherRepository.save(teacher);
    }

    public void deleteTeacher(String id){
        teacherRepository.delete(id);
    }
}

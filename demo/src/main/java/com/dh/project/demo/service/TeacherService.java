package com.dh.project.demo.service;

import com.dh.project.demo.Repository.TeacherRepository;
import com.dh.project.demo.domain.Teacher;
import com.dh.project.demo.web.TeacherController;
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

    public void addTeacher(TeacherController.RequestTeacherDTO newTeacher){
        Teacher teacherDB = new Teacher();
        teacherDB.setName(newTeacher.getName());
        teacherRepository.save(teacherDB);
    }

    public Teacher getTeacherByID(String id){
        return teacherRepository.findOne(id);
    }

    public void updateTeacher(String id, TeacherController.RequestTeacherDTO updatedTeacherDTO){
        Teacher teacher = teacherRepository.findOne(id);
        teacher.setName(updatedTeacherDTO.getName());
        teacherRepository.save(teacher);
    }

    public void deleteTeacher(String id){
        teacherRepository.delete(id);
    }
}

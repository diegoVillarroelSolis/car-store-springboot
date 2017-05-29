package com.dh.project.demo.service;

import com.dh.project.demo.domain.Teacher;
import com.dh.project.demo.repository.TeacherRepository;
import com.dh.project.demo.web.TeacherController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Cristhian on 26/05/2017.
 */
@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    public List<Teacher> getAllTeachers(){
        return teacherRepository.findAll();
    }

    public List<Teacher> getTeacherByName(String name){
        return teacherRepository.findByName(name);
    }

    public void addTeacher(TeacherController.RequestTeacherDTO newTeacherDTO){
        Teacher newteacherDB = new Teacher();
        newteacherDB.setName(newTeacherDTO.getName());
        newteacherDB.setCi(newTeacherDTO.getCi());
        teacherRepository.save(newteacherDB);
    }

    public void updateTeacher(Long id, TeacherController.RequestTeacherDTO updatedTeacher) {
        Teacher teacher = teacherRepository.findOne(id);
        teacher.setCi(updatedTeacher.getCi());
        teacher.setName(updatedTeacher.getName());
        teacherRepository.save(teacher);
    }

    public void deleteTeacher(Long id) {
        teacherRepository.delete(id);
    }
}

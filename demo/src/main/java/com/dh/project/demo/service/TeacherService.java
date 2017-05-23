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

    public void addTeacher(Teacher newTeacher){
        System.out.println("Saving a teacher with name: " + newTeacher.getName());
        //Connection data base
    }

    public void getTeacherByID(long id){
        System.out.println("Getting the teacher with id: " + id);
    }

    public void updateTeacher(long id, Teacher updatedTeacher){
        System.out.println("Updating the teacher with name: " + updatedTeacher.getName());
    }

    public void update(long id, Teacher teacher){
        System.out.println("Updating the teacher with name: " + teacher.getName());
    }

    public void deleteTeacher(long id){
        System.out.println("Deleting the teacher with id: " + id);
    }
}

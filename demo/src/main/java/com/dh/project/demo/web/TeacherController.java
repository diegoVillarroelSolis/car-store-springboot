package com.dh.project.demo.web;

import com.dh.project.demo.domain.Teacher;
import com.dh.project.demo.service.TeacherService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Cristhian on 19/05/2017.
 */
@RestController
@RequestMapping("/teachers")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
public class TeacherController {

    @Autowired//Inyeccion de dependencias
    TeacherService teacherService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Teacher> getTeacher(){
        return teacherService.getAllTeachers();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Teacher getTeacherById(@PathVariable String id){
        return teacherService.getTeacherByID(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createTeacher(@RequestBody RequestTeacherDTO newTeacher){
        teacherService.addTeacher(newTeacher);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void updateTeacher(@PathVariable String id, @RequestBody RequestTeacherDTO updatedTeacherDTO){
        teacherService.updateTeacher(id, updatedTeacherDTO);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{id}")
    public void update(@PathVariable String id, @RequestBody RequestTeacherDTO updatedTeacherDTO){
        teacherService.updateTeacher(id, updatedTeacherDTO);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteTeacher(@PathVariable String id){
        teacherService.deleteTeacher(id);
    }

    public static class RequestTeacherDTO{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

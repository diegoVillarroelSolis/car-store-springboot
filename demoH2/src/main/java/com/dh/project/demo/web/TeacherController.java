package com.dh.project.demo.web;

import com.dh.project.demo.domain.Teacher;
import com.dh.project.demo.domain.Teacher;
import com.dh.project.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Cristhian on 26/05/2017.
 */
@RestController
@RequestMapping("teachers")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Teacher> getAllTeachers(){
        return teacherService.getAllTeachers();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addTeacher(@RequestBody RequestTeacherDTO newTeacher){
        teacherService.addTeacher(newTeacher);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/name/{name}")
    public List<Teacher> getTeacherByName(@PathVariable String name){
        return teacherService.getTeacherByName(name);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void updateTeacher(@PathVariable Long id, @RequestBody RequestTeacherDTO updatedTeacher){
        teacherService.updateTeacher(id, updatedTeacher);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{id}")
    public void update(@PathVariable Long id, @RequestBody RequestTeacherDTO updatedTeacher){
        teacherService.updateTeacher(id, updatedTeacher);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteTeacher(@PathVariable Long id){
        teacherService.deleteTeacher(id);
    }

    public static class RequestTeacherDTO{
        private String name;
        private Long ci;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Long getCi() {
            return ci;
        }

        public void setCi(Long ci) {
            this.ci = ci;
        }
    }
}

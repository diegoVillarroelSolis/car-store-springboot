package com.dh.project.demo.web;

import com.dh.project.demo.domain.Student;
import com.dh.project.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Cristhian on 26/05/2017.
 */
@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentService.getStudentByID(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createStudent(@RequestBody RequestStudentDTO newStudent){
        studentService.addStudent(newStudent);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void updateTeacher(@PathVariable Long id, @RequestBody RequestStudentDTO updatedStudent){
        studentService.updateStudent(id, updatedStudent);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{id}")
    public void update(@PathVariable Long id, @RequestBody RequestStudentDTO updatedStudent){
        studentService.updateStudent(id, updatedStudent);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }

    public static class RequestStudentDTO{
        private String name;
        private long ci;
        private long codsis;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getCi() {
            return ci;
        }

        public void setCi(long ci) {
            this.ci = ci;
        }

        public long getCodsis() {
            return codsis;
        }

        public void setCodsis(long codsis) {
            this.codsis = codsis;
        }
    }
}

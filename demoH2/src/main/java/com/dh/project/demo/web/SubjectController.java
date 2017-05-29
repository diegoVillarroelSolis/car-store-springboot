package com.dh.project.demo.web;

import com.dh.project.demo.domain.Subject;
import com.dh.project.demo.service.SubjectService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Cristhian on 25/05/2017.
 */
@RestController
@RequestMapping("/subjects")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
public class SubjectController {
    @Autowired
    SubjectService subjectService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Subject> getAllSubjects(){
        return subjectService.getAllSubjects();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createSubject(@RequestBody RequestSubjectDTO newSubjectDTO){
        subjectService.addSubject(newSubjectDTO);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Subject getSubjectById(@PathVariable Long id){
        return subjectService.getSubjectByID(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void updateSubject(@PathVariable Long id, @RequestBody RequestSubjectDTO updatedSubjectDTO){
        subjectService.updateSubject(id, updatedSubjectDTO);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{id}")
    public void update(@PathVariable Long id, @RequestBody RequestSubjectDTO updatedSubjectDTO){
        subjectService.updateSubject(id, updatedSubjectDTO);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteSubject(@PathVariable Long id){
        subjectService.deleteSubject(id);
    }

    public static class RequestSubjectDTO{
        private int capacity;
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

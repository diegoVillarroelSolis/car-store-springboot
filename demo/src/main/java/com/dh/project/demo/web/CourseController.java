package com.dh.project.demo.web;

import com.dh.project.demo.domain.Course;
import com.dh.project.demo.service.CourseService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Cristhian on 20/05/2017.
 */
@RestController
@RequestMapping("/course")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
public class CourseController {

    @Autowired
    CourseService courseService;
    @RequestMapping(method = RequestMethod.GET)
    public List<Course> getCourse(){
        return courseService.getAllCourses();
    }
}

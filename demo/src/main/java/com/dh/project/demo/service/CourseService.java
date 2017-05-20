package com.dh.project.demo.service;

import com.dh.project.demo.domain.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cristhian on 20/05/2017.
 */
@Service
public class CourseService {
    public List<Course> getAllCourses(){
        List<Course> listCourse = new ArrayList<>();
        listCourse.add(new Course(1, "Biology"));
        listCourse.add(new Course(2, "Mathematics"));
        listCourse.add(new Course(3, "Physics"));
        return listCourse;
    }
}

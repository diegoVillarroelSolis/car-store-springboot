package com.dh.project.demo.Repository;

import com.dh.project.demo.domain.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by Jhonny . UUID 4xD555
 */
public interface TeacherRepository extends MongoRepository<Teacher, String>{
}


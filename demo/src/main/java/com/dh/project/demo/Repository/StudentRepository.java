package com.dh.project.demo.Repository;

import com.dh.project.demo.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by Cristhian on 24/05/2017.
 */
public interface StudentRepository extends MongoRepository<Student, String>{
    @Query("{'name': {$regex:?0}}")
    List<Student> findByName(String name);
}

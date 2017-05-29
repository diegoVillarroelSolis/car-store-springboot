package com.dh.project.demo.repository;

import com.dh.project.demo.domain.Student;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Cristhian on 26/05/2017.
 */
public interface StudentRepository extends CrudRepository<Student, Long> {
}

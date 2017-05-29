package com.dh.project.demo.repository;

import com.dh.project.demo.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Cristhian on 26/05/2017.
 */
public interface TeacherRepository extends JpaRepository<Teacher, Long>{
    @Query("select u from Teacher u where u.name like %?1%")
    List<Teacher> findByName(String name);
}

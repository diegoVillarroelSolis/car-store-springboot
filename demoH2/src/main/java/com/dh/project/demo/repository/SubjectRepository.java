package com.dh.project.demo.repository;

import com.dh.project.demo.domain.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Cristhian on 25/05/2017.
 */
public interface SubjectRepository extends JpaRepository<Subject,Long> {
}

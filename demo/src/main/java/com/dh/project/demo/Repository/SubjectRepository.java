package com.dh.project.demo.Repository;

import com.dh.project.demo.domain.Subject;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Cristhian on 25/05/2017.
 */
public interface SubjectRepository extends MongoRepository<Subject,String> {
}

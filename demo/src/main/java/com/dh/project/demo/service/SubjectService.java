package com.dh.project.demo.service;

import com.dh.project.demo.Repository.SubjectRepository;
import com.dh.project.demo.domain.Subject;
import com.dh.project.demo.web.SubjectController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Cristhian on 25/05/2017.
 */
@Service
public class SubjectService {
    @Autowired
    SubjectRepository subjectRepository;

    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    public void addSubject(SubjectController.RequestSubjectDTO newSubjectDTO) {
        Subject newSubjectDB = new Subject();
        newSubjectDB.setName(newSubjectDTO.getName());
        newSubjectDB.setCapacity(newSubjectDTO.getCapacity());
        subjectRepository.save(newSubjectDB);
    }

    public Subject getSubjectByID(String id) {
        return subjectRepository.findOne(id);
    }

    public void updateSubject(String id, SubjectController.RequestSubjectDTO updatedSubjectDTO) {
        Subject subject = subjectRepository.findOne(id);
        subject.setName(updatedSubjectDTO.getName());
        subject.setCapacity(updatedSubjectDTO.getCapacity());
        subjectRepository.save(subject);
    }

    public void deleteSubject(String id) {
        subjectRepository.delete(id);
    }
}

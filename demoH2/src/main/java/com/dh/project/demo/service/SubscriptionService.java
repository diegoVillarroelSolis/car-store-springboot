package com.dh.project.demo.service;

import com.dh.project.demo.domain.*;
import com.dh.project.demo.repository.*;
import com.dh.project.demo.web.SubscriptionController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Cristhian on 26/05/2017.
 */
@Service
public class SubscriptionService {
    @Autowired
    private SubscriptionRepository subscriptionRepository;
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private SubjectRepository subjectRepository;
    @Autowired
    private RoomRepository roomRepository;

    public List<Subscription> getAllSubscriptions(){
        return subscriptionRepository.findAll();
    }

    public void addSubscription(SubscriptionController.RequestSubscriptionDTO newSubDTO){
        Subscription newSubDb = new Subscription();

        Student newStudent = studentRepository.findOne(newSubDTO.getStudentId());
        Teacher newTeacher = teacherRepository.findOne(newSubDTO.getTeacherId());
        Subject newSubject = subjectRepository.findOne(newSubDTO.getSubjectId());
        Room newRoom = roomRepository.findOne(newSubDTO.getRoomId());

        newSubDb.setStudent(newStudent);
        newSubDb.setTeacher(newTeacher);
        newSubDb.setSubDate(newSubDTO.getSubDate());
        newSubDb.setSubject(newSubject);
        newSubDb.setRoom(newRoom);

        subscriptionRepository.save(newSubDb);
    }
}

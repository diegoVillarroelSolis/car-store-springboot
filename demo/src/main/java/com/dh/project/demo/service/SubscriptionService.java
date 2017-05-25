package com.dh.project.demo.service;

import com.dh.project.demo.Repository.*;
import com.dh.project.demo.domain.*;
import com.dh.project.demo.web.SubscriptionController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Created by Cristhian on 24/05/2017.
 */
@Service
public class SubscriptionService {
    @Autowired
    SubscriptionRepository subscriptionRepository;
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    TeacherRepository teacherRepository;
    @Autowired
    SubjectRepository subjectRepository;
    @Autowired
    RoomRepository roomRepository;

    public List<Subscription> getAllSubscription(){
        return subscriptionRepository.findAll();
    }

    public void addSubscription(SubscriptionController.RequestSubscriptionDTO newSubscriptionDTO) {
        Student newStudent = studentRepository.findOne(newSubscriptionDTO.getStudentId());
        Teacher newTeacher = teacherRepository.findOne(newSubscriptionDTO.getTeacherId());
        Subject newSubject = subjectRepository.findOne(newSubscriptionDTO.getSubjectId());
        Room newRoom = roomRepository.findOne(newSubscriptionDTO.getRoomId());

        Subscription newSubscriptionDB = new Subscription();
        newSubscriptionDB.setSubscriptionDay(newSubscriptionDTO.getSubscriptionDay());
        newSubscriptionDB.setStudent(newStudent);
        newSubscriptionDB.setTeacher(newTeacher);
        newSubscriptionDB.setSubject(newSubject);
        newSubscriptionDB.setRoom(newRoom);
        subscriptionRepository.save(newSubscriptionDB);
    }
}

package com.dh.project.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by Cristhian on 24/05/2017.
 */
@Document
public class Subscription {
    @Id
    private String id;
    private Date subscriptionDay;
    @DBRef
    private Teacher teacher;
    @DBRef
    private Student student;
    @DBRef
    private Subject subject;
    @DBRef
    private Room room;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getSubscriptionDay() {
        return subscriptionDay;
    }

    public void setSubscriptionDay(Date subscriptionDay) {
        this.subscriptionDay = subscriptionDay;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}

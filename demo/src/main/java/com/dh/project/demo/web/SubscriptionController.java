package com.dh.project.demo.web;

import com.dh.project.demo.domain.Subscription;
import com.dh.project.demo.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Created by Cristhian on 24/05/2017.
 */
@RestController
@RequestMapping("/subscriptions")
public class SubscriptionController {
    @Autowired
    SubscriptionService subscriptionService;
    @RequestMapping(method = RequestMethod.GET  )
    public List<Subscription> getAllSubscription(){
        return subscriptionService.getAllSubscription();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addSubscription(@RequestBody RequestSubscriptionDTO newSubscription){
        subscriptionService.addSubscription(newSubscription);
    }

    public static class RequestSubscriptionDTO{
        private Date subscriptionDay;
        private String teacherId;
        private String studentId;
        private String subjectId;
        private String roomId;

        public Date getSubscriptionDay() {
            return subscriptionDay;
        }

        public void setSubscriptionDay(Date subscriptionDay) {
            this.subscriptionDay = subscriptionDay;
        }

        public String getTeacherId() {
            return teacherId;
        }

        public void setTeacherId(String teacherId) {
            this.teacherId = teacherId;
        }

        public String getStudentId() {
            return studentId;
        }

        public void setStudentId(String studentId) {
            this.studentId = studentId;
        }

        public String getSubjectId() {
            return subjectId;
        }

        public void setSubjectId(String subjectId) {
            this.subjectId = subjectId;
        }

        public String getRoomId() {
            return roomId;
        }

        public void setRoomId(String roomId) {
            this.roomId = roomId;
        }
    }
}

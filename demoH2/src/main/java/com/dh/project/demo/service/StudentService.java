package com.dh.project.demo.service;

import com.dh.project.demo.domain.Student;
import com.dh.project.demo.repository.StudentRepository;
import com.dh.project.demo.web.StudentController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Cristhian on 26/05/2017.
 */
@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return (List<Student>) studentRepository.findAll();
    }


    public Student getStudentByID(Long id) {
        return studentRepository.findOne(id);
    }

    public void addStudent(StudentController.RequestStudentDTO newStudentDTO) {
        Student newStudentDB = new Student();
        newStudentDB.setName(newStudentDTO.getName());
        newStudentDB.setCi(newStudentDTO.getCi());
        newStudentDB.setCodsis(newStudentDTO.getCodsis());
        studentRepository.save(newStudentDB);
    }

    public void updateStudent(Long id, StudentController.RequestStudentDTO updatedStudent) {
        Student student = studentRepository.findOne(id);
        student.setName(updatedStudent.getName());
        student.setCi(updatedStudent.getCi());
        student.setCodsis(updatedStudent.getCodsis());
        studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.delete(id);
    }
}

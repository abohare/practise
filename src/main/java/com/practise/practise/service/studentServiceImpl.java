package com.practise.practise.service;

import com.practise.practise.entity.Student;
import com.practise.practise.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class studentServiceImpl implements StudentService{
    @Autowired
    StudentRepository studentRepository;
    @Override//interface ke same naam ka method banate hai toh uske karan hum override ka uske krte hai
    public Student createstudent(Student student) {
       return studentRepository.save(student);
    }

    @Override
    public Student getstudent(Long StudentId) {
        return studentRepository.findById(StudentId).get();
    }

    @Override
    public Student updatestudent(Long StudentId,Student updateStudent ) {
        Student student = studentRepository.findById(StudentId).get();
        student.setStudentName(updateStudent.getStudentName());
        return studentRepository.save(student);
    }

}

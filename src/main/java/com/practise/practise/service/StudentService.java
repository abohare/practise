package com.practise.practise.service;

import com.practise.practise.entity.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public interface StudentService {

    public Student createstudent(Student student);//abstract method wo hote hai jiske andar hum body define ni krte hai
    public Student getstudent(Long StudentId);
    public Student updatestudent(Long StudentId,Student updateStudent);
}

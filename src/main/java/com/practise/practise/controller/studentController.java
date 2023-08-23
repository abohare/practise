package com.practise.practise.controller;

import com.practise.practise.entity.Marks;
import com.practise.practise.entity.Student;
import com.practise.practise.repository.MarksRepository;
import com.practise.practise.repository.StudentRepository;
import com.practise.practise.service.MarksService;
import com.practise.practise.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController

public class studentController {
    @Autowired
     private StudentService studentService;//service class ke interface ka instance variable bnate hai
    @Autowired
    private MarksService marksService;

    @PostMapping("/Student_Details")
    public Student createstudent(@RequestBody Student student)//
    {
         return this.studentService.createstudent(student);//this jo create student
    }

    @PostMapping("/Marks")
    public Marks createmarks(@RequestBody Marks marks)
    {
        return this.marksService.createmarks(marks);
    }
    @GetMapping("/Details/{StudentId}")
    public Student getstudent(@PathVariable Long StudentId){
        return this.studentService.getstudent(StudentId);
    }

    @PutMapping("/update/{StudentId}")
    public Student updatestudent(@PathVariable Long StudentId,@RequestBody Student updateStudent)
    {
        return this.studentService.updatestudent(StudentId,updateStudent);
    }
}

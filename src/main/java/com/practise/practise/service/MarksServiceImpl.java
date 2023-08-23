package com.practise.practise.service;


import com.practise.practise.entity.Marks;
import com.practise.practise.repository.MarksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarksServiceImpl implements MarksService{
    @Autowired
    MarksRepository marksrepository;

    @Override
    public Marks createmarks(Marks marks) {
        return marksrepository.save(marks);
    }
}

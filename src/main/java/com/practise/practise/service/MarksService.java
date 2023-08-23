package com.practise.practise.service;

import com.practise.practise.entity.Marks;
import org.springframework.stereotype.Service;

@Service
public interface MarksService {
     Marks createmarks(Marks marks);
}

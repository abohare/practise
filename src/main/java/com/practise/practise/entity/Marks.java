package com.practise.practise.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Data
@Table(name = "Student_Marks")
@Entity
public class Marks {
    @Id
    private Long id;
    private int mathMarks;
    private int englisMarks;
    private int hindiMarks;
    private int socialMarks;
}

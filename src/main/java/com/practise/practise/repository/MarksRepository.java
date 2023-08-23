package com.practise.practise.repository;

import com.practise.practise.entity.Marks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarksRepository extends JpaRepository<Marks,Long> {
}

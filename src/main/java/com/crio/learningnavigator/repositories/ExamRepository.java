package com.crio.learningnavigator.repositories;

import com.crio.learningnavigator.entities.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ExamRepository extends JpaRepository<Exam, Long> {
    
}

package com.crio.learningnavigator.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.crio.learningnavigator.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    
}

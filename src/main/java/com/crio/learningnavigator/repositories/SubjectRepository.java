package com.crio.learningnavigator.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.crio.learningnavigator.entities.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> { 
}


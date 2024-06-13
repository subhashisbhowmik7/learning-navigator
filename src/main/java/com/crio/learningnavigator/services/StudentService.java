package com.crio.learningnavigator.services;

import com.crio.learningnavigator.dtos.StudentDto;
import com.crio.learningnavigator.entities.Exam;
import com.crio.learningnavigator.entities.Student;
import com.crio.learningnavigator.entities.Subject;
import com.crio.learningnavigator.repositories.ExamRepository;
import com.crio.learningnavigator.repositories.StudentRepository;
import com.crio.learningnavigator.repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

 
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public Student createStudent(Student student) {
      
        // handle subjects and exams similarly
        return studentRepository.save(student);
    }

    public Student updateStudent(Long id, Student student) {
        Student updatedStudent = student;

        return studentRepository.save(updatedStudent);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}

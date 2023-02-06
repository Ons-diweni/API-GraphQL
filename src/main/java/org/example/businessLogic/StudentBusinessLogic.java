package org.example.businessLogic;

import org.example.persistenceLogic.StudentRepository;
import org.example.models.Student;

import java.util.List;

public class StudentBusinessLogic {

    private StudentRepository studentRepository = new StudentRepository() ;


    public List<Student> getAll() {return  this.studentRepository.getStudents();}
    public void saveStudent (Student student) { this.studentRepository.getStudents().add(student);}



}

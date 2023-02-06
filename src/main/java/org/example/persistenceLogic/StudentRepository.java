package org.example.persistenceLogic;

import lombok.Getter;
import lombok.Setter;
import org.example.models.Student;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class StudentRepository {

    private final List<Student> students ;

    public StudentRepository () { students = new ArrayList<>();
        students.add(new Student("1123456","Ons","Ons.diweni@gmail.com"));
        students.add(new Student("145879","Houssem","Houssem@gmail.com"));
        students.add(new Student("1123456","Kaouther","Kaouther@gmail.com"));
    }

}

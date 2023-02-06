package org.example.graphQLResolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.example.businessLogic.StudentBusinessLogic;
import org.example.models.Student;

import java.util.List;

@RequiredArgsConstructor
public class QueriesResolver implements GraphQLQueryResolver {

    private final StudentBusinessLogic studentBusinessLogic ;

    public List<Student> allStudents () {return this.studentBusinessLogic.getAll();}





}

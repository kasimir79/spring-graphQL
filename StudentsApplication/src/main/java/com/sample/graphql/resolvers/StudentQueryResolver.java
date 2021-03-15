package com.sample.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.sample.graphql.model.Student;
import com.sample.graphql.service.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentQueryResolver implements GraphQLQueryResolver
{
    @Autowired
    private StudentService studentService;

    public Student student (String name)
    {
        return studentService.getStudentDetailsByName(name);
    }
    
    public List<Student> students(){
    	return studentService.getAllStudents();
    }
}

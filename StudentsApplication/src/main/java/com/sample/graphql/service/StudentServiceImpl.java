package com.sample.graphql.service;

import org.springframework.stereotype.Service;

import com.sample.graphql.model.Address;
import com.sample.graphql.model.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService
{
	
    private Map<String, Student> map = new HashMap<String,Student>(){{
    	put("ion",new Student("Alex",25,new Address("Bucuresti","Arad",1234)));
    	put("marcel",new Student("Raul",21,new Address("Alexandri","Iasi",61234)));
    	put("marcela",new Student("Cosmin",29,new Address("Cosbuc","Ineu",91234)));
    	put("anca",new Student("Eugen",26,new Address("Mehala","Timisoara",71234)));
    }};
    
    @Override
    public List<Student> getAllStudents(){
    	 return map.values().stream().collect(Collectors.toList());
    	
    }
    

    @Override
    public Student getStudentDetailsByName (String name)
    {
        return null != name? map.get(name) : null;
    }

    @Override
    public Student createStudentRecord (Student student)
    {
        if(null != student) {
            map.put(student.getName(), student);
        }
        return student;
    }
}

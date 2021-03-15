package com.sample.graphql.resolvers;

import static org.hamcrest.CoreMatchers.any;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.sample.graphql.model.Address;
import com.sample.graphql.model.Student;
import com.sample.graphql.service.StudentService;

@RunWith(MockitoJUnitRunner.class)
public class StudentQueryResolver1Test {

	@Mock
	private StudentService studentServiceMock;
	
	@InjectMocks
	private StudentQueryResolver sut;
	
	@Test
	public void test() {
		Student studentExpected = new Student("Alex",25,new Address("Bucuresti","Arad",1234));
		studentExpected.setName("Ion");
		when(studentServiceMock.getStudentDetailsByName("Ion")).thenReturn(studentExpected);
		
		assertEquals(studentExpected, sut.student("Ion"));
	}

}

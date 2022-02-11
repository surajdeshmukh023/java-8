package com.learnJava.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsMapExample {
	
	public static List<String> namesList(){ //map method used to convert one type to other
		List<String> studentNameList=  StudentDataBase.getAllStudents().stream() // Stream<Student>
		//student as input and output will be -> student name
		.map(Student::getName) // Stream<String>
		.map(String::toUpperCase)
		.collect(Collectors.toList()); 
		
		return studentNameList;
	}
	
	public static Set<String> namesSet() { // map method used to convert one type to other
		Set<String> nameSet = StudentDataBase.getAllStudents().stream().map(Student::getName).map(String::toUpperCase)
				.collect(Collectors.toSet());
		return nameSet;
	}

	public static void main(String[] args) {
		//System.out.println(namesList());
		System.out.println(namesSet());

	}

}

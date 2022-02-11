package com.learnJava.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsDebugging {

	public static void main(String[] args) {

		// use of peek method to check data passing
		List<Student> studentList = StudentDataBase.getAllStudents().stream().peek(s -> System.out.println(s))
				.filter(s -> s.getGpa() > 0).peek(s -> System.out.println("After first filter " + s))
				.filter(s -> s.getName() != null).collect(Collectors.toList());
		System.out.println(studentList);

		// peek() -> This method exists mainly to support debugging, where you want to
		// see the
		// elements as they flow past a certain point in a pipeline
	}

}

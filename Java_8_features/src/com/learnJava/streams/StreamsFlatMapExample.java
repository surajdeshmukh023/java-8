package com.learnJava.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsFlatMapExample {

	public static List<String> printStudentActivities() {
		List<String> StudentAcitviesNames = StudentDataBase.getAllStudents().stream()	//Stream<Student>
				.map(Student::getActivities)											//Stream<List<String>>
				.flatMap(List::stream)													//Stream<String>
				.collect(Collectors.toList());
		return StudentAcitviesNames;
	}

	public static void main(String[] args) {
		// Generally used for nested data structure which contains other elements
		System.out.println(printStudentActivities());
	}

}

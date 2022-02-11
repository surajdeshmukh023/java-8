package com.learnJava.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsSQLFuncrionsExample {

	public static void main(String[] args) {

		List<String> studentAcitviesNames = StudentDataBase.getAllStudents().stream().map(Student::getActivities)
				.flatMap(List::stream).distinct().collect(Collectors.toList());
		System.out.println("Unique activities name " + studentAcitviesNames);

		long count = StudentDataBase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream)
				.distinct().count();

		System.out.println("Activities count " + count);
		
		List<String> sortedActivities = StudentDataBase.getAllStudents().stream()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.sorted().collect(Collectors.toList());
		
		System.out.println(sortedActivities);
	}

}

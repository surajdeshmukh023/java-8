package com.learnJava.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsComparatorExample {

	public static List<Student> sortStudentByName() {
		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());
	}

	public static List<Student> sortStudentByGradeLevel() {
		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGradeLevel))
				.collect(Collectors.toList());
	}

	public static List<Student> sortStudentByGradeLevelDescending() {
		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGradeLevel).reversed())
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {

		sortStudentByName().forEach(System.out::println);
		System.out.println("LOG");
		sortStudentByGradeLevel().forEach(System.out::println);
		System.out.println("LOG");
		sortStudentByGradeLevelDescending().forEach(System.out::println);

	}

}

package com.learnJava.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamExample {

	public static void main(String[] args) {

		// get student and their activities
		// stream method can be called on arrays or collections
		// filter for filtering out using the criteria it acecepts the predicate

		Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
				.filter(o -> o.getGradeLevel() > 3).collect(Collectors.toMap(Student::getName, Student::getActivities));

		// System.out.println(studentMap);

		Predicate<Student> studentGradePredicate = (student -> student.getGradeLevel() > 3);
		Predicate<Student> studentNamePredicate = (student -> student.getName().startsWith("A"));

		// filter and create map using filter and collect
		Map<String, List<String>> studentGradeMap = StudentDataBase.getAllStudents().stream()
				.filter(studentGradePredicate).collect(Collectors.toMap(Student::getName, Student::getActivities));

		// System.out.println(studentGradeMap);

		// filter and create map using the name starting criteria
		Map<String, String> studentGenderMap = StudentDataBase.getAllStudents().stream().filter(studentNamePredicate)
				.collect(Collectors.toMap(Student::getName, Student::getGender));

		// System.out.println(studentGenderMap);

		// Predicate chaining to apply multiple filter criteria
		Map<String, String> tempStudentMap = StudentDataBase.getAllStudents().stream().filter(studentGradePredicate)
				.filter(studentNamePredicate).collect(Collectors.toMap(Student::getName, Student::getGender));

		System.out.println(tempStudentMap);

		// stream API working ->
		/*
		 * stream -> intermediate operations -> terminal operation
		 * 
		 */
		// Terminal operation must to collect the result
		
		//collection vs stream
		/*
		 * Elements can be added or modified to collection 
		 * Elements cannot be added or modified in the stream. It is fixed data set
		 * 
		 * Elements can be accessed in any order from collection
		 * Elements can be accessed only in sequential manner in stream
		 * 
		 * collection is eagerly constructed
		 * streams is lazily constructed
		 */

	}

}

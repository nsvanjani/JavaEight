package com.core.code.java8.functional.interfaces;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.core.code.mocker.DataGenerator;
import com.core.code.mocker.Student;

public class PredicateStudentExample {

	public static void main(String[] args) {
		Predicate<Student> p1 = (s) -> s.getCourses().contains("Math");
		Predicate<Student> p2 = (s) -> s.getCurrentScore() >800;
		Consumer<Student> printStudentName = (student) -> System.out.println(student.getName());
		List<Student> listOfStudents = DataGenerator.getListOfStudent();
		listOfStudents.forEach(student -> {
			if (p1.and(p2).test(student)) {
				printStudentName.accept(student);
			}
		});
	}
}

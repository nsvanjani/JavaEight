package com.core.code.java8.methodReferences;

import java.util.List;
import java.util.function.Function;

import com.core.code.mocker.DataGenerator;
import com.core.code.mocker.Student;

public class MethodReferenceExample {
	public static void main(String[] args) {
		List<Student> studentList = DataGenerator.getListOfStudent();
		
		//studentList.forEach(student -> {System.out.println(student.toString());});
		studentList.forEach(System.out::println);
		
		Function<String, String> upperCase = String::toUpperCase;
		
		studentList.forEach(student-> upperCase.apply(student.toString()));
		
		studentList.stream().forEach(student -> upperCase.apply(student.toString()));
		
	}
}

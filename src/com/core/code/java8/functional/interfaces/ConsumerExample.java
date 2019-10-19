package com.core.code.java8.functional.interfaces;

import java.util.List;
import java.util.function.Consumer;

import com.core.code.mocker.DataGenerator;
import com.core.code.mocker.Student;

public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());
		
		consumer.accept("This is the string");
		
		List<Student> studentList = DataGenerator.getListOfStudent();
		
		Consumer<Student> studentPrinterConsumer = (student)-> System.out.println(student);
		studentList.forEach(studentPrinterConsumer);
		printNameAndActivity();
		
		
	}
	
	public static void printNameAndActivity() {
		Consumer<Student> nameConsumer =  (student) -> System.out.println(student.getName());
		Consumer<Student> activityConsumer = (student) -> System.out.println(student.getActivitiesList());
		List<Student> studentList = DataGenerator.getListOfStudent();
		System.out.println("**************");
		studentList.forEach(nameConsumer.andThen(activityConsumer));
		
	}
	
	
}

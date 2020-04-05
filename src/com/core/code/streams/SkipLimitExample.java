package com.core.code.streams;

import java.util.List;

import com.core.code.mocker.DataGenerator;
import com.core.code.mocker.Student;

public class SkipLimitExample {
	
	public static void main(String[] args) {
		List<Student> studentList = DataGenerator.getListOfStudent();
		System.out.println("original");
		studentList.stream().forEach(System.out::println);
		System.out.println("after limit");
		studentList.stream().limit(2).forEach(System.out::println);
		System.out.println("after skip");
		studentList.stream().skip(3).forEach(System.out::println);
	}

}

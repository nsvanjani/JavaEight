package com.core.code.streams;

import java.util.List;

import com.core.code.mocker.DataGenerator;
import com.core.code.mocker.Student;

public class ParallelStreamExample {
public static void main(String[] args) {
	List<Student> studentList =  DataGenerator.getListOfStudent();
	Long l = System.currentTimeMillis();
	studentList.stream().forEach(System.out::println);
	System.out.println(System.currentTimeMillis()-l);
	l= System.currentTimeMillis();
	studentList.parallelStream().forEach(System.out::println);
	System.out.println(System.currentTimeMillis()-l);
}
}

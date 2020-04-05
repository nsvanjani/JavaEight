package com.core.code.streams.terminal.operations;

import java.util.List;
import java.util.stream.Collectors;

import com.core.code.mocker.DataGenerator;
import com.core.code.mocker.Student;

public class JoiningOperationsExample {
	public static void main(String[] args) {
		List<Student> studentList = DataGenerator.getListOfStudent();
		String str = studentList.stream().
				map(Student::getName).collect(Collectors.joining());
		System.out.println(str);
		str = studentList.stream().
				map(Student::getName).collect(Collectors.joining("~"));
		System.out.println(str);
		str = studentList.stream().
				map(Student::getName).collect(Collectors.joining("~","prefix","suffix"));
		System.out.println(str);
	}
}

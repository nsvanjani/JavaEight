package com.core.code.streams.terminal.operations;

import java.util.List;
import java.util.stream.Collectors;

import com.core.code.mocker.DataGenerator;
import com.core.code.mocker.Student;

public class CountingExample {
	public static void main(String[] args) {
		List<Student> studentList = DataGenerator.getListOfStudent();
		Long longer = studentList.stream().collect(Collectors.counting());
		System.out.println(longer);
	}
}

package com.core.code.streams.terminal.operations;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.core.code.mocker.DataGenerator;
import com.core.code.mocker.Student;

public class MappingExample {
	public static void main(String[] args) {
		List<Student> studentList = DataGenerator.getListOfStudent();
		List<String> nameList = 
				studentList.stream().collect(Collectors.mapping
						(Student::getName, Collectors.toList()));
		System.out.println(nameList);
		Set<String> nameSet = 
				studentList.stream().collect(Collectors.mapping
						(Student::getName, Collectors.toSet()));
		System.out.println(nameSet);
	}
}

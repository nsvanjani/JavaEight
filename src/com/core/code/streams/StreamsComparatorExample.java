package com.core.code.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.core.code.mocker.DataGenerator;
import com.core.code.mocker.Student;

public class StreamsComparatorExample {
	public static void main(String[] args) {
		List<Student> studentList = DataGenerator.getListOfStudent();
		List<Student> sortedList = studentList.stream().
				sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());
		sortedList.forEach(System.out::println);
	}
}

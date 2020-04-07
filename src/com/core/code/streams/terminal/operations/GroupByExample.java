package com.core.code.streams.terminal.operations;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.core.code.mocker.DataGenerator;
import com.core.code.mocker.Student;

public class GroupByExample {
public static void main(String[] args) {
	List<Student> studentList = DataGenerator.getListOfStudent();
	
	
	Map<Boolean,List<Student>> groupResult= 
			studentList.stream().collect(Collectors.groupingBy(Student::getIsXStudent));
	System.out.println(groupResult);
	
	
}
}

package com.core.code.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

import com.core.code.mocker.DataGenerator;
import com.core.code.mocker.Student;

public class ReduceExample {
	public static void main(String[] args) {
		List<Integer> intList =  Arrays.asList(1,2,3,4,5);
		
		Integer normalResult = intList.stream().reduce(1, (a,b) -> a*b);
		System.out.println(normalResult);
		
		Optional<Integer> normalResult1 = intList.stream().reduce((a,b) -> a*b);
		System.out.println(normalResult1);
		if(normalResult1.isPresent()) {
			System.out.println(normalResult.intValue());
		}
	
		//highest GPA student using reduce
		
		
		List<Student> studentList =  DataGenerator.getListOfStudent();
		BinaryOperator<Student> highestCurrentScore = (student1,student2) ->{
			if(student1.getCurrentScore()> student2.getCurrentScore()) {
				return student1;
			}else {
				return student2;
			}
		};
		Optional<Student> optionalResult = 
				studentList.stream().reduce(highestCurrentScore);
		System.out.println(optionalResult.get());
		
		
	}
}

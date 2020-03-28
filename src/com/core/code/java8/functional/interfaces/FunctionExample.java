package com.core.code.java8.functional.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

import com.core.code.mocker.DataGenerator;
import com.core.code.mocker.Student;

public class FunctionExample {
	public static void main(String[] args) {

		Function<List<Student>, Map<String, Double>> func = (studentList) ->{
			Map<String, Double> map = new HashMap<>();
			studentList.forEach(student -> map.put(student.getName() ,student.getCurrentScore()));
			return map;
		};
		Function<List<Student>,String> func2  = (studentList) -> {
			String names ="";
			studentList.forEach(student ->{
				 names.concat(student.getName());
			});
			return names;
		};
//	System.out.println(func.apply(DataGenerator.getListOfStudent()));
//	System.out.println(func.compose(func2).apply(DataGenerator.getListOfStudent()));
	
	
	Predicate<Student> currentScoreLessThanFourHundred = 
			(student) -> {
				return student.getCurrentScore()<400d;
			};
			
	Function<List<Student>, Map<String,Double> > studentToNameAndScoreMapFunction =
			(studentList) ->{
				Map<String, Double> map = new HashMap<>();
				studentList.forEach(student -> map.put(student.getName() ,student.getCurrentScore()));
				return map;
			};
			
	}
	
	
	
}

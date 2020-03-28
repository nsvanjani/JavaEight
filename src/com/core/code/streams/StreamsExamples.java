package com.core.code.streams;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.core.code.mocker.DataGenerator;
import com.core.code.mocker.Student;

public class StreamsExamples {
	public static void main(String[] args) {
		List<Student> listOfStudents = DataGenerator.getListOfStudent();
		
		
		Predicate<Student> predicate = (s) -> s.getCurrentScore() > 700;
		Consumer<Student> printStudent =  System.out::println;
		
		Map<Integer, String> mapOStudents = listOfStudents.stream().
				peek(printStudent).filter(predicate)
				.peek(printStudent)
				.collect(Collectors.toMap(Student::getId, Student::getName));
		
		BiConsumer<Integer, String> biCon = (id,name) -> {System.out.println(id +":"+ name);}; 	
		mapOStudents.forEach(biCon);
		
		Function<Student, String> function = (student) ->{ String s = student.getName()+" has a current score of "+ student.getCurrentScore();
			return s;
		};
		List<String> desiredList =listOfStudents.stream().map(function).collect(Collectors.toList());
		
		desiredList.forEach(s -> System.out.println(s));
		
		
		
		
		
	}
}

package com.core.code.java8.functional.interfaces;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

import com.core.code.mocker.DataGenerator;
import com.core.code.mocker.Student;

public class BiPredicateExample {
	public static void main(String[] args) {
		BiPredicate<List<String>, Double> courseAndScorePredicate = (courses , score) ->{
			return courses.contains("Science")&& score<500d;
		};
		
		Consumer<Student> studentConsumer = (student) -> {
			if(courseAndScorePredicate.test(student.getCourses(), student.getCurrentScore())) {
				System.out.println(student.getName() +" is the one who you are looking for baba");
			}
		};
		DataGenerator.getListOfStudent().forEach(studentConsumer);
	}
}

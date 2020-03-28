package com.core.code.java8.functional.interfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.core.code.mocker.Activity;
import com.core.code.mocker.DataGenerator;
import com.core.code.mocker.Student;

public class PredicateAndConsumerExample {

	public static void main(String[] args) {

		Predicate<Student> gpaCheck = (student) -> {
			return (student.getCurrentScore() > 300d);
		};
		
		BiConsumer<String, List<Activity>> biCon = (name,activity) ->{
			System.out.print(name + " does these activities ");
			 activity.stream().
					forEach(s-> System.out.print( " "+s.getName()));
			 System.out.println();
		};

		Consumer<Student> con = (student) -> {
			if(gpaCheck.test(student))
			{
				biCon.accept(student.getName(), student.getActivitiesList());
			}
		};
		
		
		DataGenerator.getListOfStudent().forEach(con);
		System.out.println("Done!");
		
		
	}

}

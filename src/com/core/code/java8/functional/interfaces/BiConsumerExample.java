package com.core.code.java8.functional.interfaces;

import java.util.function.BiConsumer;

import com.core.code.mocker.DataGenerator;
import com.core.code.mocker.Student;

public class BiConsumerExample {

	public static void main(String[] args) {
		BiConsumer<Student, String> biConsumer = (s,str) ->{
			System.out.println(s.getName()+str);
		};
		
		
		BiConsumer<Student, String> doesNOtStudy = (s,str) ->{System.out.println(s.getName()+"Does Not study");};
//		biConsumer.andThen(doesNOtStudy).accept(DataGenerator.getListOfStudent().get(3), " is a good student"));
//		biConsumer.accept(DataGenerator.getListOfStudent().get(3), " is a good student");
		biConsumer.andThen(doesNOtStudy).accept(DataGenerator.getListOfStudent().get(3), " is a good student");
		
	}
	
	
}

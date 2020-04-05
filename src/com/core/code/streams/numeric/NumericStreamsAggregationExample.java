package com.core.code.streams.numeric;

import java.util.List;
import java.util.function.DoubleSupplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

import com.core.code.mocker.DataGenerator;
import com.core.code.mocker.Student;

public class NumericStreamsAggregationExample {
	public static void main(String[] args) {
		
//		List<Student> studentList = DataGenerator.getListOfStudent();
//		List<Double> currentScoreList =
//				studentList.stream().
//				map(student-> student.getCurrentScore()).collect(Collectors.toList());
		
		
//		DoubleSupplier doubleSupplier = ()->{
//			
//		};
//		DoubleStream doubleStream = DoubleStream.of();
//		System.out.println(doubleStream.max().getAsDouble());
		
		IntStream i = IntStream.rangeClosed(12, 432);
		System.out.println(i.sum());
	}
}

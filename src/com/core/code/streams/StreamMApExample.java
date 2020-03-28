package com.core.code.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.core.code.mocker.Activity;
import com.core.code.mocker.DataGenerator;
import com.core.code.mocker.Student;

public class StreamMApExample {
	public static void main(String[] args) {
		// code notes: after using the map function we need to always collect the values
		// for one value, like for getting one string value we need to use the list.get(0)
		// for avoiding the null pointer in the get(0) we must use the filter method previously 
		List<Student> studentList = DataGenerator.getListOfStudent();
		Predicate<Activity> sportActivity = (activity) -> activity.getIsSport();
		Predicate<Student> studentWithSportActivity = (student) -> {
			return student.getActivitiesList().stream().anyMatch(sportActivity);
		};
		Function<Student, String> mapper = (student) -> {
			return student.getName() + " has a sports activity "
					+ student.getActivitiesList().stream().
					filter(sportActivity).map(activity -> activity.getName()).
					collect(Collectors.toList()).get(0);

		};
//		this code finds the student with 
//		sports activity and prints the name of student with which is the sports activity
		// start reading the code from here .. 
		studentList.stream().
				filter(studentWithSportActivity).
				map(mapper).collect(Collectors.toList()).forEach(System.out::println);
	}
}

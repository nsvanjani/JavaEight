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
		studentList.stream().
				filter(studentWithSportActivity).
				map(mapper).collect(Collectors.toList()).forEach(System.out::println);;
	}
}

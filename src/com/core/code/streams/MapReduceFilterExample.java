package com.core.code.streams;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

import com.core.code.mocker.DataGenerator;
import com.core.code.mocker.Student;

public class MapReduceFilterExample {
	public static void main(String[] args) {
		List<Student> studentList = DataGenerator.getListOfStudent();
		

		Predicate<Student> getStudentsWithScore800 =
				(student) -> {return student.getCurrentScore()>800;};
		BinaryOperator<Integer> notebookSummingMachine = 
				(int1,int2) ->{
					return int1+int2;
				};
		Function<Student, Integer> mapStudentToNumberOfNotebooksInt =
				(student)->{
					return student.getNotebooks();
				};
				
		Optional<Integer> optionalSumOfNoteBooks =
				studentList.stream().filter(getStudentsWithScore800)
				.map(mapStudentToNumberOfNotebooksInt).reduce(notebookSummingMachine);
		
		System.out.println(optionalSumOfNoteBooks.get());
	}
}

package com.core.code.mocker;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataGenerator {

	public static List<Student> getListOfStudent(){
		List <Student> listOfStudent = new ArrayList<>();
		
		listOfStudent.add(new Student("Navin", Arrays.asList("Math", "Science" , "Geography"), 
				Arrays.asList((new Activity("Running", 12, Boolean.TRUE,  LocalDate.of(2017, 1, 13) )) ,
						(new Activity("Study", 35, Boolean.FALSE,  LocalDate.of(2017, 12, 23) )),
						(new Activity("Lab", 12, Boolean.FALSE,  LocalDate.of(2017, 10, 27) )),
						(new Activity("Research", 12, Boolean.FALSE,  LocalDate.of(2017, 9, 29) ))),
				Boolean.FALSE, 347 , 786.8,8));
		
		listOfStudent.add(new Student("Anshu", Arrays.asList("Math", "Science" , "Geography", "English", "French"), 
				Arrays.asList((new Activity("Running", 72, Boolean.TRUE,  LocalDate.of(2017, 1, 12) )) ,
						(new Activity("Study", 75, Boolean.FALSE,  LocalDate.of(2017, 12, 2) )),
						(new Activity("Lab", 72, Boolean.FALSE,  LocalDate.of(2017, 10, 7) )),
						(new Activity("Research", 72, Boolean.FALSE,  LocalDate.of(2017, 9, 9) ))),
				Boolean.FALSE, 237 , 987.1,16));
		
		listOfStudent.add(new Student("Pankaj", Arrays.asList("Math", "Science" , "Geography", "English", "French", "SAP"), 
				Arrays.asList((new Activity("Running", 32, Boolean.TRUE,  LocalDate.of(2017, 1, 22) )) ,
						(new Activity("Study", 55, Boolean.FALSE,  LocalDate.of(2017, 12, 15) )),
						(new Activity("Lab", 67, Boolean.FALSE,  LocalDate.of(2017, 10, 14) )),
						(new Activity("Research", 144, Boolean.FALSE,  LocalDate.of(2017, 9, 19) ))),
				Boolean.FALSE, 236 , 980.1,19));
		
		listOfStudent.add(new Student("Guruji", Arrays.asList("Math", "Science" , "Geography", "English", "French","Electronics","Hindi", "Biology"), 
				Arrays.asList((new Activity("Walking", 212, Boolean.TRUE,  LocalDate.of(2017, 1, 12) )) ,
						(new Activity("Study", 335, Boolean.FALSE,  LocalDate.of(2017, 12, 2) )),
						(new Activity("Lab", 122, Boolean.FALSE,  LocalDate.of(2017, 10, 7) )),
						(new Activity("Research", 412, Boolean.FALSE,  LocalDate.of(2017, 9, 9) ))),
				Boolean.FALSE, 1 , 999.9,14));
		
		listOfStudent.add(new Student("Champaqueue", Arrays.asList("Math", "Science"), 
				Arrays.asList((new Activity("Running", 122, Boolean.TRUE,  LocalDate.of(2017, 1, 1) )) ,
						(new Activity("Screaming", 5, Boolean.FALSE,  LocalDate.of(2017, 12, 7) )),
						(new Activity("Lab", 7, Boolean.FALSE,  LocalDate.of(2017, 10, 11) )),
						(new Activity("Research", 0, Boolean.FALSE,  LocalDate.of(2017, 9, 15) ))),
				Boolean.TRUE, 794 , 453.5,22));

		listOfStudent.add(new Student("Johannes", Arrays.asList( "Science", "Geology"), 
				Arrays.asList((new Activity("Standing", 178, Boolean.TRUE,  LocalDate.of(2017, 1, 4) )) ,
						(new Activity("Study", 77, Boolean.FALSE,  LocalDate.of(2017, 12, 6) )),
						(new Activity("Lab", 16, Boolean.FALSE,  LocalDate.of(2017, 10, 10) )),
						(new Activity("Research", 129, Boolean.FALSE,  LocalDate.of(2017, 9, 14) ))),
				Boolean.TRUE, 74 , 453.5,12));

		return listOfStudent;
		
	}
	
}

package com.core.code.java8.functional.interfaces;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.function.Supplier;

import com.core.code.mocker.Activity;
import com.core.code.mocker.Student;

public class SupplierExample {
	public static void main(String[] args) {
		
		Supplier <String> stringSupplier = ()->"SUpplied Value";
		
		System.out.println(stringSupplier.get());
		
		Supplier <Student> studentSupplier = ()->{
			return new Student("Navin", Arrays.asList("Math", "Science" , "Geography"), 
					Arrays.asList((new Activity("Running", 12, Boolean.TRUE,  LocalDate.of(2017, 1, 13) )) ,
							(new Activity("Study", 35, Boolean.FALSE,  LocalDate.of(2017, 12, 23) )),
							(new Activity("Lab", 12, Boolean.FALSE,  LocalDate.of(2017, 10, 27) )),
							(new Activity("Research", 12, Boolean.FALSE,  LocalDate.of(2017, 9, 29) ))),
					Boolean.FALSE, 347 , 786.8);
		};
		
		System.out.println(studentSupplier.get().toString());
	}
}

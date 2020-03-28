package com.core.code.java8.methodReferences;

import java.util.function.Supplier;

import com.core.code.mocker.Student;

public class ConstructorReferenceExample {
	public static void main(String[] args) {
		// this requires a PUBLIC constructor not a default one with no modifier.
		Supplier<Student> studentSupplier =  Student::new;
		
		
	}
}

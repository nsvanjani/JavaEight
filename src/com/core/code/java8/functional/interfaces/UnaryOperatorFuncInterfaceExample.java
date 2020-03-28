package com.core.code.java8.functional.interfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorFuncInterfaceExample {

//	unary operator is a function which accepts a type and returns the same type
	
 public static	UnaryOperator<String> uOperator = (s)-> s.concat("I concatinated this");
	public static void main(String[] args) {
		System.out.println(uOperator.apply("thus is a string "));
		
	}
}

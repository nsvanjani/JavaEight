package com.core.code.java8.functional.interfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	static Comparator<Integer> comp = (a,b) -> a.compareTo(b);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryOperator<Integer> biOp = (a, b) -> a + b;
		System.out.println(biOp.apply(10, 11) );
		
		BinaryOperator<Integer> biOpMax =  BinaryOperator.maxBy(comp);
		System.out.println(biOpMax.apply(12, 34));
		
		BinaryOperator<Integer> biOpMin =  BinaryOperator.minBy(comp);
		System.out.println(biOpMin.apply(12, 34));
		
	}

}

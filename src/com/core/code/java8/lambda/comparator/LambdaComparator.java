package com.core.code.java8.lambda.comparator;

import java.util.Comparator;

public class LambdaComparator {
	public static void main(String[] args) {
		Comparator<Integer> intCopmarator =  (a , b) -> a.compareTo(b);
		
		System.out.println(intCopmarator.compare(72, 2));
	}
}

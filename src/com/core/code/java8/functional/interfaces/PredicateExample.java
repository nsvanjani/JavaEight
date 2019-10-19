package com.core.code.java8.functional.interfaces;

import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		Predicate<Integer> predicateForEven = (n) -> n%2 == 0;
		Predicate<Integer> predicateForNegativeValue = (n) -> n<0;
		System.out.println(predicateForEven.test(123));
		System.out.println(predicateForEven.or(predicateForNegativeValue).test(-123));
		System.out.println(predicateForEven.and(predicateForNegativeValue).test(-123));
	}
}

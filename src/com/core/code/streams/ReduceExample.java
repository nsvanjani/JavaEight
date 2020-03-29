package com.core.code.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
	public static void main(String[] args) {
		List<Integer> intList =  Arrays.asList(1,2,3,4,5);
		
		Integer normalResult = intList.stream().reduce(1, (a,b) -> a*b);
		System.out.println(normalResult);
		
		Optional<Integer> normalResult1 = intList.stream().reduce((a,b) -> a*b);
		System.out.println(normalResult1);
		if(normalResult1.isPresent()) {
			System.out.println(normalResult.intValue());
		}
		
	}
}

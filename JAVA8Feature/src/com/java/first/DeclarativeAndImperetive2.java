package com.java.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DeclarativeAndImperetive2 {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 5, 6, 6, 7, 7, 8, 9, 0);

		ArrayList<Integer> uniqueList = new ArrayList<Integer>();

		for (Integer integer : intList) {
			if (!uniqueList.contains(integer)) {
				uniqueList.add(integer);
			}
	
		}
	uniqueList.forEach(uniqueL -> System.out.print(uniqueL.toString()));
	System.out.println();
	intList.stream().distinct().collect(Collectors.toList()).forEach(ul->System.out.print(ul.toString()));
	
	
	
	}
	
	
	
	
}

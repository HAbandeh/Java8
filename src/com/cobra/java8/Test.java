package com.cobra.java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		countEmptyStrings();
		countStringsMoreThan3Charachters();
		countStringsStartsWithA();
		removeEmptyStrings();
		capetalizedAndJoinWithComma();
		squareDistinctNumbers();
		summaryStatistics();
	}



	private static void countEmptyStrings() {
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		System.out.println(strList.stream().filter(i -> i.isEmpty()).count());		
	}
	
	private static void countStringsMoreThan3Charachters() {
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		System.out.println(strList.stream().filter(i -> i.length() > 3).count());
	}
	
	private static void countStringsStartsWithA() {
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		System.out.println(strList.stream().filter(i -> i.startsWith("a")).count());		
	}
	
	private static void removeEmptyStrings() {
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		List<String> newList = strList.stream().filter(i -> !i.isEmpty()).collect(Collectors.toList());
		System.out.println(newList.size());
		
	}



	private static void capetalizedAndJoinWithComma() {
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		
		String str = strList.stream().map(i -> i.toUpperCase()).collect(Collectors.joining(","));
		
		System.out.println(str);
	}
	
	
	private static void squareDistinctNumbers() {
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		numbers.stream().map( i -> i*i).distinct().forEach(System.out::println);

	}
	
	private static void summaryStatistics() {
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		IntSummaryStatistics statistics = numbers.stream().mapToInt((x) ->x).summaryStatistics();
		System.out.println(statistics);
	}

	
	

}

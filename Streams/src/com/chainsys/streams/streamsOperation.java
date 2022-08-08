package com.chainsys.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamsOperation {

	public static void main(String args[]) {
		Stream<Integer> stream = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
		stream.forEach(p -> System.out.println((p + 10) * 2));
		
		Stream<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100));

		List<Integer> mylist = randomNumbers.limit(20).collect(Collectors.toList());
		mylist.forEach(p -> System.out.println(p));
			
		IntStream stream1 = "12345_abcdefg".chars();
		stream1.forEach(p -> System.out.println(p));

		Stream<String> stream2 = Stream.of("A$B$C".split("\\$"));
		stream2.forEach(p -> System.out.println(p));	
		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 23, 10, 35));
		Stream<Integer> stream3 = list.stream();
		Integer[] evenNumbersArr = stream3.filter(i -> i % 2 == 0).toArray(Integer[]::new);
		System.out.println("Length of the list :" +evenNumbersArr.length);
		for(int i=0; i<evenNumbersArr.length; i++) {
			System.out.println(evenNumbersArr[i]);
		}
		
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
		Optional<String> reduced = memberNames.stream().reduce((s1,s2) -> s1 + "#" + s2);		 
		reduced.ifPresent(System.out::println);
		
		String firstMatchedName = memberNames.stream()
	            .filter((s) -> s.startsWith("S")).findFirst().get();	 
		System.out.println(firstMatchedName);  
	}
	
}

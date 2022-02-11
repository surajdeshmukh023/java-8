package com.learnJava.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStreams {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("apple");
		names.add("flower");
		names.add("kapil");
		
		//System.out.println(names);
		
		/**
		 * Collection can be traversed n number of times
		 * stream can be traversed only once
		 * 
		 * performs the external iteration
		 * Performs the internal iteration
		 */
		
		Stream<String> namesStream = names.stream();
		namesStream.forEach(System.out::println);
		namesStream.forEach(System.out::println);
		
		
	}

}

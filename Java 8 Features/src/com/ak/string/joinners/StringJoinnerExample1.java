package com.ak.string.joinners;

import java.util.StringJoiner;

public class StringJoinnerExample1 {

	public static void main(String[] args) {
		StringJoiner joiner = new StringJoiner(",");
		 // Adding values to StringJoiner  
		joiner.add("Rahul");  
		joiner.add("Raju");  
		joiner.add("Peter");  
		joiner.add("Raheem"); 
		
		System.out.println(joiner);
	}

}

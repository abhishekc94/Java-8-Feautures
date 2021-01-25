package com.ak.optional;

import java.util.Optional;

public class OptionalExample2 {

	public static void main(String[] args) {
		String s1 = "Hello Good Morning";
		String s2 = null;
		Optional<String> optional = Optional.of(s1);
		
		if(optional.isPresent()) {
			System.out.println(s1.toLowerCase());
			System.out.println(Optional.empty());
		}
		else {
			System.out.println("Value is not present");
		}
	}

}

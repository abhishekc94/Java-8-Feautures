package com.ak.optional;

import java.util.Optional;

public class OptionalExample1 {

	public static void main(String[] args) {
		String[] str = new String[10];
		//System.out.println(str[5].toLowerCase());Throws Null pointer Exception
		
		Optional<String> optional = Optional.ofNullable(str[5]);
		if(optional.isPresent()) {
			System.out.println(str[5].toLowerCase());
		}
		else {
			System.out.println("string value is not present");
		}
	}

}

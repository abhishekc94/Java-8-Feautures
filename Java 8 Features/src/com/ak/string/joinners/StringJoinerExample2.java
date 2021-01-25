package com.ak.string.joinners;

import java.util.StringJoiner;

//Java StringJoiner Example: adding prefix and suffix
public class StringJoinerExample2 {

	public static void main(String[] args) {
		StringJoiner joinNames = new StringJoiner(",", "[", "]"); // passing comma(,) and square-brackets as delimiter
		joinNames.add("Rahul");
		joinNames.add("Raju");
		joinNames.add("Peter");
		joinNames.add("Raheem");

		System.out.println(joinNames);
	}

}

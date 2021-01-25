package com.ak.lamba.expressions;

interface Say {
	public String wish(String wishes);
}

public class ExampleWithSingleParameter {
	public static void main(String[] args) {
		Say say = (wishes) -> {
			return "Good Morning " + wishes;
		};

		System.out.println(say.wish("Abhi Kanchan"));
	}
}

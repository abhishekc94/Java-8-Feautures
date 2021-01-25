package com.ak.lamba.expressions;

interface Addable {
	public int add(int i, int j);
}

public class ExampleWithMultipleParameters {
	public static void main(String[] args) {

		// Lambda expression with return keyword
		Addable addable1 = (a, b) -> {
			return a + b;
		};

		System.out.println(addable1.add(10, 20));

		// Lambda expression without return keyword.
		// if there is only one statement, you may or may not use return keyword.
		// You must use return keyword when lambda expression contains multiple
		// statements.
		Addable addable2 = (a, b) -> a + b;
		System.out.println(addable2.add(100, 200));

	}
}

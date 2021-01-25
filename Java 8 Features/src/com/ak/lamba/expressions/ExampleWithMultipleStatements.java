package com.ak.lamba.expressions;

interface MultipleStatement {
	public String sayble(String message);
}

public class ExampleWithMultipleStatements {

	public static void main(String[] args) {

		MultipleStatement statement = (message) -> {
			String s1 = "I would like to say, ";
			return s1 + message;
		};
		System.out.println(statement.sayble("time is precious."));
	}

}

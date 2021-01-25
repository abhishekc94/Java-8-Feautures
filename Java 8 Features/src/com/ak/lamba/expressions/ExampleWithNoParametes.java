package com.ak.lamba.expressions;

interface Sayble {
	public String sayble();
}

public class ExampleWithNoParametes {
	public static void main(String[] args) {

		Sayble sayble = () -> {
			return "Hello Good Morning";
		};

		System.out.println(sayble.sayble());
	}
}

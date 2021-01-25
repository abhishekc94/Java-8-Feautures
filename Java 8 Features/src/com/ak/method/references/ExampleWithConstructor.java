package com.ak.method.references;

interface Messagble {
	void message(String message);
}

public class ExampleWithConstructor {

	ExampleWithConstructor(String message) {
		System.out.println(message);
	}

	public static void main(String[] args) {
		Messagble messagble = ExampleWithConstructor::new;
		messagble.message("Hello Good Morning");
	}

}

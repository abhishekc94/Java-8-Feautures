package com.ak.method.references;

interface Sayble {
	public void Say();
}

public class ExampleWithStaticReference {

	public static void saySomething() {
		System.out.println("Hello Good Morning");
	}

	public static void main(String[] args) {
		Sayble say = ExampleWithStaticReference::saySomething;
		say.Say();
	}

}

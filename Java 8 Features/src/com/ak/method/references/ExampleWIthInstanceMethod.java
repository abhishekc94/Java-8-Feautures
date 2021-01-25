package com.ak.method.references;

interface Sayble1 {
	public void saySomething();
}

public class ExampleWIthInstanceMethod {

	public void saySomething() {
		System.out.println("Hello Good Morning");
	}

	public static void main(String[] args) {
		Sayble1 sayble1 = new ExampleWIthInstanceMethod()::saySomething;
		sayble1.saySomething();
	}

}

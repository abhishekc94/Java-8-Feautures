package com.ak.method.references;

public class ExampleWIthPredefinedRunnableInterface {

	public static void threadStatus() {
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		Thread thread = new Thread(ExampleWIthPredefinedRunnableInterface::threadStatus);
		thread.start();
	}

}

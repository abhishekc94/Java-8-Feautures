package com.ak.default_static.methods;

@FunctionalInterface
interface Sayble {
	default void saySomething() {
		System.out.println("Hello Good Morning");
	}

	default void saySomethingAgain() {
		System.out.println("Hello Good Morning Again");
	}

	void sayMore(String msg);

	static void sayLouder(String msg) {
		System.out.println(msg);
	}
}

public class DefaultMethodExample implements Sayble {

	@Override
	public void sayMore(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		DefaultMethodExample defaultMethodExample = new DefaultMethodExample();
		defaultMethodExample.saySomething();
		defaultMethodExample.saySomethingAgain();
		defaultMethodExample.sayMore("Hello Good Afternoon");
		Sayble.sayLouder("Hello Good Night");
	}

}

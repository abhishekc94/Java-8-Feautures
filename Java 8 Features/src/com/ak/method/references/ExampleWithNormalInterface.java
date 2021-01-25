package com.ak.method.references;

interface Addition{
	public int add(int a,int b);
}
public class ExampleWithNormalInterface {
	public static int add(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		Addition addition = ExampleWithNormalInterface::add;
		int result = addition.add(50, 50);
		System.out.println(result);
		
		Addition addition2 = (i,j) -> i+j;
		System.out.println(addition2.add(10,50));
	}

}

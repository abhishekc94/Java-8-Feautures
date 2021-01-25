package com.ak.lamba.expressions;

@FunctionalInterface
interface Shape{  
    public void draw();  
} 

public class ExampleWithLambaExpressions {
	public static void main(String[] args) {
		
		int width = 10;
		
		Shape shape = () -> {
			System.out.println("Drawing "+ width);
		};
		shape.draw();
	}
}

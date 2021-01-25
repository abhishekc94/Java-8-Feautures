package com.ak.lamba.expressions;

import java.util.ArrayList;

public class ExapmpleWithForEachLoop {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		
		arrayList.forEach(i -> {
			System.out.println(i );
		});
	}

}

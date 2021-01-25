package com.ak.lamba.expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class LapProduct {
	int id;
	String name;
	float price;

	public LapProduct(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class ExampleWithFilterCollectionData {

	public static void main(String[] args) {
		List<LapProduct> list = new ArrayList<LapProduct>();
		list.add(new LapProduct(1, "Samsung A5", 17000f));
		list.add(new LapProduct(3, "Iphone 6S", 65000f));
		list.add(new LapProduct(2, "Sony Xperia", 25000f));
		list.add(new LapProduct(4, "Nokia Lumia", 15000f));
		list.add(new LapProduct(5, "Redmi4 ", 26000f));
		list.add(new LapProduct(6, "Lenevo Vibe", 19000f));
		
		Stream<LapProduct> filtered_data = list.stream().filter(product -> product.price>2000);
		
		filtered_data.forEach(product -> System.out.println(product.id+" "+product.name+" "+product.price));
	}

}

package com.ak.streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertListToSetUsingStream {

	public static void main(String[] args) {
		
		 List<Product> productsList = new ArrayList<Product>();  
		  
	        //Adding Products  
	        productsList.add(new Product(1,"HP Laptop",25000f));  
	        productsList.add(new Product(2,"Dell Laptop",30000f));  
	        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
	        productsList.add(new Product(4,"Sony Laptop",28000f));  
	        productsList.add(new Product(5,"Apple Laptop",90000f));
	        
	     Set<Product>  set = new HashSet<>();
	     set = productsList.stream().collect(Collectors.toSet());
	     set.forEach(System.out::println);
	}

}
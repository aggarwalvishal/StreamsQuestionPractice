package com.vishal.practise.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Given a Product class with attribute id(int), name(String), price(double),
 * and category(String) 1. Create a list of products and implement the
 * functionality
 * 
 * 1.) Print the names of Product whose price is below a certain threshold (e.g
 * 100) 
 * 2.) Create a new list containing product with a price reduction of 20%
 * 3.) Calculate the average price of all products. 
 * 4.) Find the product with the lowest price using Stream API.
 */
public class Question46 {

	public static void main(String[] args) {
		Product46 p1 = new Product46(1, "LifeBoy", 20, "SOAP");
		Product46 p2 = new Product46(2, "Portronics", 200, "Adapter");
		Product46 p3 = new Product46(3, "SurfExcel", 90, "Washing Powder");
		Product46 p4 = new Product46(4, "Yamha", 8000, "Guitar");
		Product46 p5 = new Product46(5, "Ikigai", 500, "Book");

		List<Product46> productList = Arrays.asList(p1, p2, p3, p4, p5);
		// 1. Print the names of Product whose price is below a certain threshold (e.g*
		// 100)
		List<String> filterList = productList.stream().filter(p -> p.getPrice() < 100).map(Product46::getName)
				.collect(Collectors.toList());

		System.out.println(filterList);

		// 2. Create a new list containing product with a price reduction of 20%
		List<Product46> discountedPriceList = productList.stream().map(product -> {
			double discountPrice = product.getPrice() * 0.80;
			product.setPrice(discountPrice);
			return product;
		}).collect(Collectors.toList());

		System.out.println(discountedPriceList);

		// 3. Calculate the average price of all products.
		OptionalDouble averagePrice = productList.stream().mapToDouble(Product46::getPrice).average();
		System.out.println(averagePrice.getAsDouble());

		// 4. Find the product with the lowest price using Stream API.

		double lowestPrice = productList.stream().sorted(Comparator.comparing(Product46::getPrice))
				.skip(0).findFirst().get().getPrice();
		
		System.out.println(lowestPrice);

	}

}

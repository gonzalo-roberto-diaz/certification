package com.gonzalo.cert.jia.chap2;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 * write a method that can generate String output from an apple in different ways, given a list of apples
 * @author Gonzalo
 *
 */
public class PrettyApple {
	

	
	public static void prettyPrintApple(List<Apple> inventory, StringGeneratorFromApple stringGenerator ){
		for (Apple apple: inventory){
			String output = stringGenerator.generateString(apple);
			System.out.println(output);
		}
		
	}
	
	static List<Apple> inventory = new ArrayList<>();
	
	public static void main (String... strings){
		inventory.add(new Apple(Color.green, 120.0));
		inventory.add(new Apple(Color.green, 100.0));
		inventory.add(new Apple(Color.red, 90.0));
		
		prettyPrintApple(inventory, new CompleteGenerator());
		
		prettyPrintApple(inventory, new ColorfulGenerator());
		
	}
	

}

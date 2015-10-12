package com.gonzalo.cert.jia.chap2;

public class CompleteGenerator implements StringGeneratorFromApple {

	@Override
	public String generateString(Apple apple) {
		return "this apple is " + apple.color +  " and weighs " + apple.weight + " grams";
	}

}

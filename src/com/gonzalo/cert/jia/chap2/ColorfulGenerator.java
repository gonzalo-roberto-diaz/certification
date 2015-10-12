package com.gonzalo.cert.jia.chap2;

public class ColorfulGenerator implements StringGeneratorFromApple {

	@Override
	public String generateString(Apple apple) {
		return "this apple is " + apple.color.toString() ;
	}

}

package com.yazici.structural.flyweight;

import java.util.List;
import java.util.ArrayList;

public class Client {

	private final static int WORD_COUNT=1_000_000;
	
	public static void main(String[] args) {
		
		
		
		List<Word> words=new ArrayList<>();
		Long start=  System.currentTimeMillis();
		for (int i = 0; i < WORD_COUNT; i++) {
			words.add( new Word("HODOR!", Lang.OTHER));
		}
		Long end=  System.currentTimeMillis();
		System.out.println("Without Flyweight : " + (end-start));
		
		
		words.clear();

		start=  System.currentTimeMillis();
		for (int i = 0; i < WORD_COUNT; i++) {
			words.add( WordFactory.getWord("HODOR!", Lang.OTHER));
		}
		end=  System.currentTimeMillis();
		System.out.println("With Flyweight : " + (end-start));
		
		
		// Console output
		// Without Flyweight : 66
		// With Flyweight : 26

	}

}

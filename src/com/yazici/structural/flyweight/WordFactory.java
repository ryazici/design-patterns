package com.yazici.structural.flyweight;

import java.util.HashMap;

public class WordFactory {

	private static final HashMap<String,Word> words = new HashMap<>();
	
	
	public  static Word getWord(String key,Lang lang) {
		if(!words.containsKey(key))
			words.put(key,new Word(key,lang));
	
		return words.get(key);
	}
	
}

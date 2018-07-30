package com.yazici.structural.flyweight;

public class Word {

	public String word;
	public Lang lang;
	
	
	public Word(String word, Lang lang) {
		super();
		this.word = word;
		this.lang = lang;
	}


	public String getWord() {
		return word;
	}


	public Lang getLang() {
		return lang;
	}
	
	
}

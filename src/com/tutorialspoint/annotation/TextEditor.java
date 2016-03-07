package com.tutorialspoint.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {

	@Autowired(required=false)
	private SpellChecker spellChecker;
	
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
package com.tutorialspoint.di;

public class TextEditor {

	private SpellChecker spellChecker;
	
	public TextEditor() {
	}
	
	public TextEditor(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("setting spell chcker ...");
		this.spellChecker = spellChecker;
	}
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}

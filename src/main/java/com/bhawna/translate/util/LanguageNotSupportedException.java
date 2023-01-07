package com.bhawna.translate.util;

public class LanguageNotSupportedException extends RuntimeException{
	public LanguageNotSupportedException(String msg){
		super(msg);
	}
}

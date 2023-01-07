package com.bhawna.translate.service;

import org.ligboy.translate.model.TranslateResult;

public interface TranslationService {
	public TranslateResult translate(String fromLang, String toLang, String text);
}

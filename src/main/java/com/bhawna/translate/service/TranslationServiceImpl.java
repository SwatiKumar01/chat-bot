package com.bhawna.translate.service;

import org.ligboy.translate.Translate;
import org.ligboy.translate.model.TranslateResult;
import org.springframework.stereotype.Service;

import com.bhawna.translate.util.GoogleTranslateLangyages;
import com.bhawna.translate.util.LanguageNotSupportedException;

@Service
public class TranslationServiceImpl implements TranslationService{

	@Override
	public TranslateResult translate(String fromLang, String toLang, String text) {		
		String fromLangCode= GoogleTranslateLangyages.get(fromLang);
		String toLangCode = GoogleTranslateLangyages.get(toLang);
		TranslateResult result = null;
		if(fromLangCode == null){
			throw new LanguageNotSupportedException(fromLang+" is not supported");
		}
		if(toLangCode == null){
			throw new LanguageNotSupportedException(toLang+" is not supported.");
		}

		final Translate translate = new Translate.Builder()
				.logLevel(Translate.LogLevel.BODY)
				.build();
		try {
			//throw some exception if validations fails..or just say an error occurred. 
			translate.refreshTokenKey();
			result = translate.translate(text,
					fromLangCode, toLangCode); //pass these values accordingly and add some validations
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return result;
	}
}



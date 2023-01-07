package com.bhawna.translate.controller;

import org.ligboy.translate.model.TranslateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bhawna.translate.service.TranslationService;
import com.bhawna.translate.util.LanguageNotSupportedException;

@RestController
@RequestMapping(value="/translationApi")
public class TranslateController {
	
	@Autowired
	TranslationService service;
	@CrossOrigin
	@RequestMapping(value = "/translate", method = RequestMethod.GET)
	public ResponseEntity<?> translateText(@RequestParam("fromLang")String fromLang, 
			@RequestParam("toLang")String toLang, 
			@RequestParam("text")String text){
		ResponseEntity<?> response = null;
		// we will call service here to translate and return the translated string from here
		try{
			TranslateResult result = service.translate(fromLang, toLang, text);
			response = new ResponseEntity<TranslateResult>(result,HttpStatus.OK);
		}catch(LanguageNotSupportedException le){
			response = new ResponseEntity<>(le.getMessage(),HttpStatus.EXPECTATION_FAILED);
		}catch(Exception e){
			response = new ResponseEntity<>(e.getStackTrace(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return response;
	}
}

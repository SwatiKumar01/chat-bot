package com.bhawna.calories.util;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class BeanProvider {
	private static Logger log = Logger.getLogger(BeanProvider.class);
	@SuppressWarnings("unchecked")
	public static <T> T getBean(String id, Class T){
		T bean = null;
		try{
			bean = (T)ApplicationContextProvider.getApplicationContext().getBean(id);
		}catch (Exception e) {
			log.error("inside getBean method"+e);
			
		}
		
		return bean;
	}
}

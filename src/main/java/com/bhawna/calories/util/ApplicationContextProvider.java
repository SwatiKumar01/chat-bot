package com.bhawna.calories.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextProvider implements ApplicationContextAware{

    private static String APP_ROOT_DATA_PATH;
    @Autowired
    private static ApplicationContext context;

    public static ApplicationContext getApplicationContext() {
	return context;
    }

    @Override
    public void setApplicationContext(ApplicationContext ac)
	    throws BeansException {
	context = ac;
    }

    public static String getApplicationDataRootPath(){
	return APP_ROOT_DATA_PATH;
    }

}
package com.jaydip.spring.di.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jaydip.spring.di.configuration.DIConfiguration;
import com.jaydip.spring.di.consumer.MyApplication;

public class ClientApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
		MyApplication app = context.getBean(MyApplication.class);
		
		app.processMessage("Hi Jaydip", "jaydip@abc.com");
		
		//close the context
		context.close();
	}

}

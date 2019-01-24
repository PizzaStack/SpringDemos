package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.beans.ArtistService;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		// ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		// ApplicationContext context = new AnnotationConfigApplicationContext(AutowireConfig.class);
		
		ArtistService aService = (ArtistService) context.getBean("artistservice");
		
		aService.getArtists();
		System.out.println(aService.getArtistById(1));
		
		((AbstractApplicationContext) context).close();
	}
}

package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.beans.Album;
import com.revature.beans.Artist;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Artist a = (Artist) context.getBean("artist");
		System.out.println(a);
		
		Album al = context.getBean(Album.class);
		System.out.println(al);
		
		
		((AbstractApplicationContext) context).close();
	}
}

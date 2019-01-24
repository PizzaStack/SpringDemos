package com.revature;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.revature.config.HibernateConfig;
import com.revature.dao.ArtistDao;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
		
		ArtistDao dao = context.getBean("artistDao", ArtistDao.class);
		
		System.out.println(dao.getArtists());
		
		context.close();

	}

}

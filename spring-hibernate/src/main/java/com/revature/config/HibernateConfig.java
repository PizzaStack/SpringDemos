package com.revature.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.revature.dao.ArtistDao;

@Configuration
@ComponentScan("com.revature")
@EnableTransactionManagement
@PropertySource("classpath:application.properties")
public class HibernateConfig {
	
	@Autowired
	private Environment env;
	
	@Bean
	public DataSource myDataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(env.getProperty("jdbc.driverClassName"));
		ds.setUrl(env.getProperty("jdbc.url"));
		ds.setUsername(env.getProperty("jdbc.username"));
		ds.setPassword(env.getProperty("jdbc.password"));
		return ds;
	}

	@Bean
	public LocalSessionFactoryBean mySessionFactory() {
		LocalSessionFactoryBean sf = new LocalSessionFactoryBean();
		sf.setDataSource(myDataSource());
		sf.setPackagesToScan(new String[] {"com.revature"});
		
		Properties hbp = new Properties();
		hbp.setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
		sf.setHibernateProperties(hbp);
		
		return sf;
	}
	
	@Bean
	public HibernateTransactionManager myTransactionManager(SessionFactory sf) {
		HibernateTransactionManager htm = new HibernateTransactionManager();
		htm.setSessionFactory(sf);
		return htm;
	}
	
	@Bean
	public ArtistDao myArtistDao(SessionFactory sf) {
		ArtistDao dao = new ArtistDao();
		dao.setSessionFactory(sf);
		return dao;
	}
}

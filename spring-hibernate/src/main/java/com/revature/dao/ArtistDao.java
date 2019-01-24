package com.revature.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.revature.entity.Artist;

@Repository
public class ArtistDao {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public List<Artist> getArtists() {
		return sessionFactory.openSession().createQuery("from artist").list();
	}
}

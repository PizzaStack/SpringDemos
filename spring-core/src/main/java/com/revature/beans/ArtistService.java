package com.revature.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArtistService {
	@Autowired
	private ArtistRepository dao;

	public void setDao(ArtistRepository dao) {
		this.dao = dao;
	}

	public void getArtists() {
		String[] artists = dao.getArtists();
		for (int i = 0; i < artists.length; i++)
			System.out.println(artists[i]);
	}
	
	public String getArtistById(int id) {
		return dao.getArtists()[id];
	}

	public ArtistService(ArtistRepository dao) {
		super();
		this.dao = dao;
	}

	public ArtistService() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

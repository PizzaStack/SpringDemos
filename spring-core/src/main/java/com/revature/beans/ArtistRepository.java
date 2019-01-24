package com.revature.beans;

import org.springframework.stereotype.Repository;

@Repository
public class ArtistRepository {
	String url;
	String username;
	String password;
	String[] artists = { "Bon Jovi", "Childish Gambino" };

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String[] getArtists() {
		return artists;
	}

	public void setArtists(String[] artists) {
		this.artists = artists;
	}

	public ArtistRepository(String url, String username, String password) {
		super();
		this.url = url;
		this.username = username;
		this.password = password;
	}

	public ArtistRepository() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

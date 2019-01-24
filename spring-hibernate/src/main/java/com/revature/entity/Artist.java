package com.revature.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "artist")
public class Artist {
	@Id
	private int artistid;
	private String name;

	public int getArtistid() {
		return artistid;
	}

	public void setArtistid(int artistid) {
		this.artistid = artistid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Artist(int artistid, String name) {
		super();
		this.artistid = artistid;
		this.name = name;
	}

	public Artist() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Artist [artistid=" + artistid + ", name=" + name + "]";
	}

}

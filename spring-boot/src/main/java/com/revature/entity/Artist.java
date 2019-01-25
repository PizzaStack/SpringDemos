package com.revature.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "artist")
public class Artist {
	@Id
	@NotNull
	private int artistid;
	
	@Pattern(regexp="[a-z-A-Z]")
	@Min(value=1)
	@Max(value=15)
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

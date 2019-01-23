package com.revature.beans;

public class Album {
	private int albumid;
	private String title;
	private Artist artistid;

	public int getAlbumid() {
		return albumid;
	}

	public void setAlbumid(int albumid) {
		this.albumid = albumid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Artist getArtistid() {
		return artistid;
	}

	public void setArtistid(Artist artistid) {
		this.artistid = artistid;
	}

	@Override
	public String toString() {
		return "Album [albumid=" + albumid + ", title=" + title + ", artistid=" + artistid + "]";
	}

	public Album(int albumid, String title, Artist artistid) {
		super();
		this.albumid = albumid;
		this.title = title;
		this.artistid = artistid;
	}

	public Album() {
		super();
		// TODO Auto-generated constructor stub
	}

}

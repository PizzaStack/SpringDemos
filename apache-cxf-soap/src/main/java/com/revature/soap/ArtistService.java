package com.revature.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ArtistService {
	@WebMethod
	public String getHelloWorld(String name);
}

package com.revature.soap;

import javax.jws.WebService;

@WebService(endpointInterface="com.revature.soap.ArtistService", serviceName="ArtistService")
public class ArtistServiceImpl implements ArtistService {

	@Override
	public String getHelloWorld(String name) {
		return "Hello, " + name;
	}

}

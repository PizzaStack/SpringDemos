package com.revature;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.revature.beans.ArtistRepository;
import com.revature.beans.ArtistService;

@Configuration
public class BeanConfig {
	@Bean(name="artistrepository")
	public ArtistRepository getArtistRepository() {
		return new ArtistRepository("DatabaseUrl", "chinook", "p4ssw0rd");
	}
	
	@Bean(name="artistservice")
	public ArtistService getArtistService(@Qualifier("artistrepository") ArtistRepository a) {
		return new ArtistService(a);
	}
}

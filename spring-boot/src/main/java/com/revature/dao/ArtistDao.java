package com.revature.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.entity.Artist;

@Repository
public interface ArtistDao extends JpaRepository<Artist, Integer> {
	Artist findByName(String name);
	
	@Transactional
	List<Artist> findByArtistidBetween(Integer min, Integer max);
}

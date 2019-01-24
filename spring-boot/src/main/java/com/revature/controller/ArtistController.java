package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.dao.ArtistDao;
import com.revature.entity.Artist;

@RestController
public class ArtistController {
	@Autowired
	ArtistDao dao;
	
	@GetMapping("/artists")
	public List<Artist> getAll() {
		return dao.findAll();
	}
	
	@PostMapping("/add")
	public Artist add(@RequestBody Artist a) {
		dao.save(a);
		return a;
	}
	
	@GetMapping("/artists/{name}")
	public Artist findByName(@PathVariable("name") String name) {
		return dao.findByName(name);
	}
	
	@DeleteMapping("/artists/{id}")
	public void deleteById(@PathVariable("id") int id) {
		dao.deleteById(id);
	}
	
	@GetMapping("/artists/{min}/{max}")
	public List<Artist> getBetweenIds(@PathVariable("min") int min, @PathVariable("max") int max) {
		return dao.findByArtistidBetween(min, max);
	}
	
//	@GetMapping("/artists/{id}")
//	public Artist getById(@PathVariable("id") Integer id) {
//		return dao.findAllById(ids);
//	}
}

package com.revature.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/artist")
public class ArtistController {
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public ResponseEntity<String> helloWorld() {
		return ResponseEntity.ok("Hello World");
	}
	
	@GetMapping("/")
	@ResponseBody
	public String index() {
		return "/static/index.html";
	}
	
	@GetMapping("/index")
	public String home() {
		return "/static/index.html";
	}
	
	@GetMapping("/redirect")
	public String redirect() {
		return "redirect:/hello";
	}
	
	@GetMapping("/forward")
	public String forward() {
		return "forward:/index";
	}
	
	@GetMapping("/{name}")
	public ResponseEntity<String> returnName(@PathVariable("name") String n) {
		return ResponseEntity.ok("Hello, " + n);
	}
	
	@GetMapping("/{name}/{lname}")
	public ResponseEntity<String> returnName(@PathVariable("name") String n, @PathVariable("lname") String m) {
		return ResponseEntity.ok("Hello, " + n + " " + m);
	}
}

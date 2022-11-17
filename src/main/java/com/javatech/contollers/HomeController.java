package com.javatech.contollers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home")
	public ResponseEntity<String> home()
	{
		return new ResponseEntity<>("Hello World",HttpStatus.OK);
	}
}

package com.MBS.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MBS.Exception.ResourceNotFoundException;
import com.MBS.Model.Hall;
import com.MBS.Model.Movies;
import com.MBS.Model.Shows;
import com.MBS.Service.UserService;

@RestController
@RequestMapping("/query")
public class User {

	@Autowired
	UserService service;

	@GetMapping("/fecthByShowId/{showId}")
	public ResponseEntity<Optional<Shows>> findByShowId(@PathVariable int showId) {
		Optional<Shows> obj = service.findByShowId(showId);
		if (obj.isEmpty()) {
			throw new ResourceNotFoundException("Invalid Show Id,enter valid Id");
		}
		return new ResponseEntity<Optional<Shows>>(obj, HttpStatus.OK);
	}

	@GetMapping("/fetchByMovieName/{movieName}")
	public ResponseEntity<List<Movies>> findByMovieName(@PathVariable String movieName) {
		List<Movies> obj = service.findByMovieName(movieName);
		if (obj.isEmpty()) {
			throw new ResourceNotFoundException("Invalid movie name,enter valid name");
		}
		return new ResponseEntity<List<Movies>>(obj, HttpStatus.OK);

	}

	@GetMapping("/fecthByHallId/{hallId}")
	public ResponseEntity<Optional<Hall>> findByHallId(@PathVariable int hallId) {
		Optional<Hall> obj = service.findByHallId(hallId);
		if (obj.isEmpty()) {
			throw new ResourceNotFoundException("Invalid hall Id,enter valid Id");
		}
		return new ResponseEntity<Optional<Hall>>(obj, HttpStatus.OK);
	}

}

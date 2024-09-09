package com.MBS.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MBS.Model.Hall;
import com.MBS.Model.Movies;
import com.MBS.Model.Shows;
import com.MBS.Repository.HallRepo;
import com.MBS.Repository.MoviesRepo;
import com.MBS.Repository.ShowsRepo;

@Service
public class UserService {

	@Autowired
	HallRepo repo;

	public Optional<Hall> findByHallId(int hallId) {
		return repo.findById(hallId);
	}

	@Autowired
	MoviesRepo repo1;

	public List<Movies> findByMovieName(String movieName) {
		return repo1.findByMovieName(movieName);
	}

	@Autowired
	ShowsRepo repo2;

	public Optional<Shows> findByShowId(int showId) {
		return repo2.findById(showId);
	}

}

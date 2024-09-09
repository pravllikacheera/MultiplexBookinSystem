package com.MBS.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MBS.Model.Movies;

@Repository
public interface MoviesRepo extends JpaRepository<Movies,Integer>{
	
	List<Movies> findByMovieName(String movieName);

}


package com.MBS.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Movies {

	@Id
	@Column(name = "MOVIE_ID")
	private int movieId;

	@Column(name = "MOVIE_NAME")
	private String movieName;

	@OneToMany(mappedBy = "movies")
	private List<Shows> shows = new ArrayList<>();

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public List<Shows> getShows() {
		return shows;
	}

	public void setShows(List<Shows> shows) {
		this.shows = shows;
	}

	public Movies(String movieName) {
		super();
		this.movieName = movieName;
	}

	public Movies(int movieId, String movieName, List<Shows> shows) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.shows = shows;

	}

	public Movies() {
		super();
	}

}

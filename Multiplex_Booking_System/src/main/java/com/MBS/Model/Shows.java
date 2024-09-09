package com.MBS.Model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Shows {

	@Id
	@Column(name = "SHOW_ID")
	private int showId;

	@OneToOne
	@JoinColumn(name = "HALL_ID")
	private Hall hall;

	@ManyToOne
	@JoinColumn(name = "MOVIE_ID")
	private Movies movies;

	@Column(name = "FROM_DATE")
	private LocalDate fromDate;

	@Column(name = "TO_DATE")
	private LocalDate toDate;

	@Column(name = "START_TIME")
	private LocalTime startTime;

	@Column(name = "END_TIME")
	private LocalTime endTime;

	public int getShowId() {
		return showId;
	}

	public void setShowId(int showId) {
		this.showId = showId;
	}

	public String getMovieName() {
		return movies.getMovieName();
	}

	public String getHallName() {
		return hall.getHallName();
	}

	public LocalDate getFromDate() {
		return fromDate;
	}

	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}

	public LocalDate getToDate() {
		return toDate;
	}

	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public Shows(int showId, Hall hall, Movies movies, LocalDate fromDate, LocalDate toDate, LocalTime startTime,
			LocalTime endTime) {
		super();
		this.showId = showId;
		this.hall = hall;
		this.movies = movies;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public Shows() {
		super();
	}

	public Shows(int showId, LocalDate fromDate) {
		super();
		this.showId = showId;
		this.fromDate = fromDate;
	}

}

package com.MBS.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Hall {

	@Id
	@Column(name = "HALL_ID")
	private int hallId;

	@Column(name = "HALL_DESC")
	private String hallName;

	@Column(name = "TOTAL_CAPACITY")
	private int totalCapacity;

	@Column(name = "AVAILABLE_SEATS")
	private int availableSeats;

	@OneToOne(mappedBy = "hall")
	private Shows shows;

	public int getHallId() {
		return hallId;
	}

	public void setHallId(int hallId) {
		this.hallId = hallId;
	}

	public String getHallName() {
		return hallName;
	}

	public void setHallDesc(String hallName) {
		this.hallName = hallName;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public String getMovieName() {
		return shows.getMovieName();
	}

	public Hall(String hallName) {
		super();
		this.hallName = hallName;
	}

	public Hall() {
		super();
	}

	public Hall(int hallId, String hallName, int totalCapacity) {
		super();
		this.hallId = hallId;
		this.hallName = hallName;
		this.totalCapacity = totalCapacity;
	}

}

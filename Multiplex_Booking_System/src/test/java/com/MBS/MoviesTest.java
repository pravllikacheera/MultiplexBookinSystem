package com.MBS;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.MBS.Model.Hall;
import com.MBS.Model.Movies;
import com.MBS.Model.Shows;
import com.MBS.Repository.MoviesRepo;
import com.MBS.Service.UserService;

@SpringBootTest
public class MoviesTest {

	@MockBean
	private MoviesRepo repo1;

	@Autowired
	private UserService service;

	@Test
	public void getShowsByMovieName() {
		Movies m = new Movies("RRR");
		Hall h = new Hall("AA");
		Shows sh = new Shows(21, h, m, LocalDate.parse("2022-03-23"), LocalDate.parse("2022-04-30"),
				LocalTime.parse("18:00:00"), LocalTime.parse("21:00:00"));
		List<Shows> s = new ArrayList<>();
		s.add(sh);
		Movies ms = new Movies(1, "RRR", s);
		List<Movies> m1 = new ArrayList<>();
		m1.add(ms);
		when(repo1.findByMovieName("RRR")).thenReturn(m1);

		assertEquals(1, service.findByMovieName("RRR").size());
	}

}
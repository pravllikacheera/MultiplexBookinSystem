package com.MBS;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.MBS.Model.Shows;
import com.MBS.Repository.ShowsRepo;
import com.MBS.Service.UserService;

@SpringBootTest
public class ShowsTest {

	@MockBean
	private ShowsRepo repo;

	@Autowired
	private UserService service;

	@Test
	public void getByShowId() {
		int showId = 21;
		Shows sh = new Shows(showId, LocalDate.parse("2022-03-31"));
		Optional<Shows> s = Optional.of(sh);
		when(repo.findById(showId)).thenReturn(s);
		assertEquals(true, service.findByShowId(showId).isPresent());

	}

}
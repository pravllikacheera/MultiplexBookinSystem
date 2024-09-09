package com.MBS;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.MBS.Model.Hall;
import com.MBS.Repository.HallRepo;
import com.MBS.Service.UserService;

@SpringBootTest
public class HallTest {

	@MockBean
	private HallRepo repo2;

	@Autowired
	private UserService service;

	@Test
	public void getByHallId() {
		int hallId = 12;
		Hall hl = new Hall(hallId, "AA", 120);
		Optional<Hall> s = Optional.of(hl);
		when(repo2.findById(hallId)).thenReturn(s);
		assertEquals(true, service.findByHallId(hallId).isPresent());

	}

}

package com.workflex.codingchallenge;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.workflex.codingchallenge.entities.Workation;
import com.workflex.codingchallenge.repositories.WorkationRepository;

@SpringBootTest
class CodingchallengeApplicationTests {

	@Autowired
	private WorkationRepository workationRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void dataIsLoaded() {
		Long numberOfRows = workationRepository.count();
		assertTrue(numberOfRows == 5);
	}
	
	@Test
	public void dataIsCorrect() {
		Optional<Workation> workation = workationRepository.findById("w1");
		assertTrue(workation.isPresent());
		assertTrue("Steffen Jacobs".equals(workation.get().getEmployee()));
	}

}

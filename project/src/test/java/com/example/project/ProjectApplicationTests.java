package com.example.project;

import com.example.project.repository.PlayerRepository;
import com.example.project.repository.TeamRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ProjectApplicationTests {

	@Autowired
	private TeamRepository teamRepository;

	@Autowired
	private PlayerRepository playerRepository;

	@Test
	public void playerRepository_shouldFind12(){
		assertEquals(12, playerRepository.findAll().size());
	}

	@Test
	void contextLoads() {
	}

}

package com.astontech.encryption.lecture;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	@Autowired
	AccountRepository accountRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void dbConnection() {
		assertTrue(accountRepository.count() > 0);
		System.out.println(accountRepository.findAll());
	}
}

package br.com.spring.simpletableapi.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.spring.simpletableapi.services.DBService;

@Configuration
@Profile(value = "test")
public class TestProfile {

	private final DBService dbService;

	public TestProfile(DBService dbService) {
		this.dbService = dbService;
	}

	@Bean
	public Boolean instaciaDB() {
		return this.dbService.instanciDB();
	}
}

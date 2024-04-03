package br.com.spring.simpletableapi.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import br.com.spring.simpletableapi.models.Config;
import br.com.spring.simpletableapi.repositorys.ConfigRepository;

@Service
public class DBService {

	private final ConfigRepository configRepository;

	public DBService(ConfigRepository configRepository) {
		this.configRepository = configRepository;
	}

	public Boolean instanciaDB() {
		Config config = new Config("api/heroes", "assets/textfile.txt", "2020-01-29");
		Config config1 = new Config("api/heroes1", "assets/textfile1.txt", "2020-01-29");
		this.configRepository.saveAll(Arrays.asList(config, config1));
		return true;
	}
}

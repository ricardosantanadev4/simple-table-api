package br.com.spring.simpletableapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.spring.simpletableapi.models.Config;
import br.com.spring.simpletableapi.repositorys.ConfigRepository;

@Service
public class ConfigService {

	private final ConfigRepository configRepository;

	public ConfigService(ConfigRepository configRepository) {
		this.configRepository = configRepository;
	}

	public List<Config> findAll(String param) {
		if (param == null) {
			return this.configRepository.findAll();
		} else {
			return this.configRepository.findAllByParam(param.toLowerCase());
		}
	}

}
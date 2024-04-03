package br.com.spring.simpletableapi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring.simpletableapi.models.Config;
import br.com.spring.simpletableapi.service.ConfigService;

@RestController
@RequestMapping(value = "/api/config")
public class ConfigController {
	private final ConfigService configService;

	public ConfigController(ConfigService configService) {
		this.configService = configService;
	}

	@GetMapping
	public List<Config> findAll(@RequestParam(required = false) String param) {
		return this.configService.findAll(param);
	}
}
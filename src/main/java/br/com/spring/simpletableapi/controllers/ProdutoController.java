package br.com.spring.simpletableapi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.spring.simpletableapi.dtos.ProdutoDTO;
import br.com.spring.simpletableapi.services.ProdutoService;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {

	private final ProdutoService produtoService;

	public ProdutoController(ProdutoService produtoService) {
		this.produtoService = produtoService;
	}

	@GetMapping
	public List<ProdutoDTO> findAll() {
		return this.produtoService.findAll();
	}
}
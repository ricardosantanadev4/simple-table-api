package br.com.spring.simpletableapi.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.spring.simpletableapi.dtos.ProdutoDTO;
import br.com.spring.simpletableapi.repositorys.ProdutoRepository;

@Service
public class ProdutoService {

	private final ProdutoRepository produtoRepository;

	public ProdutoService(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}

	public List<ProdutoDTO> findAll() {
		return this.produtoRepository.findAll().stream().map(produto -> new ProdutoDTO(produto))
				.collect(Collectors.toList());
	}

}

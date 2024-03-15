package br.com.spring.simpletableapi.services;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import br.com.spring.simpletableapi.models.Fabricante;
import br.com.spring.simpletableapi.models.Produto;
import br.com.spring.simpletableapi.repositorys.FabricanteRepository;
import br.com.spring.simpletableapi.repositorys.ProdutoRepository;

@Service
public class DBService {
	private final ProdutoRepository produtoRepository;
	private final FabricanteRepository fabricanteRepository;

	public DBService(ProdutoRepository produtoRepository, FabricanteRepository fabricanteRepository) {
		this.produtoRepository = produtoRepository;
		this.fabricanteRepository = fabricanteRepository;
	}

	public Boolean instanciDB() {
		Fabricante nestle = new Fabricante("Nestlé");
		Fabricante saoBraz = new Fabricante("São Braz");
		Fabricante santaClara = new Fabricante("Santa Clara");
		Fabricante nescau = new Fabricante("Nescau");

		Produto chocolateNestle = new Produto("chocolate", "perecivel", 7.50, nestle);
		Produto leiteNinho = new Produto("Leite Ninho", "perecivel", 40.93, nestle);
		Produto cafeSaoBraz = new Produto("Café São Braz", "perecivel", 8.50, saoBraz);
		Produto cafeSantaClara = new Produto("Café Santa Clara", "perecivel", 8.50, santaClara);
		Produto chocolateEmPoNescau = new Produto("Chocolate Em Pó Nescau", "perecivel", 8.50, nescau);

		nestle.getProdutos().addAll(Arrays.asList(chocolateNestle, leiteNinho));
		saoBraz.getProdutos().add(cafeSaoBraz);
		santaClara.getProdutos().add(cafeSantaClara);
		nescau.getProdutos().add(chocolateEmPoNescau);

		this.fabricanteRepository.saveAll(Arrays.asList(nestle, saoBraz, santaClara, nescau));
		this.produtoRepository
				.saveAll(Arrays.asList(chocolateNestle, leiteNinho, cafeSaoBraz, cafeSantaClara, chocolateEmPoNescau));

		return true;
	}
}

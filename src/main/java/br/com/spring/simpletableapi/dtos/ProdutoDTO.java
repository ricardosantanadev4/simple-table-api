package br.com.spring.simpletableapi.dtos;

import br.com.spring.simpletableapi.models.Fabricante;
import br.com.spring.simpletableapi.models.Produto;

public class ProdutoDTO {

	private Long id;
	private String nome;
	private String categoria;
	private Double valor;
	private Fabricante fabricante;

	
	public ProdutoDTO(Produto produto) {
		this.id = produto.getId();
		this.nome = produto.getNome();
		this.categoria = produto.getCategoria();
		this.valor = produto.getValor();
		this.fabricante = produto.getFabricante();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

}

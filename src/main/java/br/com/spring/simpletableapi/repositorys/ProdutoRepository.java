package br.com.spring.simpletableapi.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.spring.simpletableapi.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}

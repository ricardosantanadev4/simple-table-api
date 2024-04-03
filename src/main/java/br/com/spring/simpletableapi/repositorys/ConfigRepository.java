package br.com.spring.simpletableapi.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.spring.simpletableapi.models.Config;

@Repository
public interface ConfigRepository extends JpaRepository<Config, Long> {

	@Query(value = "SELECT obj FROM Config obj WHERE LOWER(obj.heroesUrl) LIKE %?1%  "
			+ "OR LOWER(obj.textfile) LIKE %?1% OR LOWER(obj.date) LIKE %?1%")
	List<Config> findAllByParam(String param);
}

package br.com.spring.simpletableapi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Config {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String heroesUrl;
	private String textfile;
	private String date;

	public Config() {
	}

	public Config(String heroesUrl, String textfile, String date) {
		this.heroesUrl = heroesUrl;
		this.textfile = textfile;
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHeroesUrl() {
		return heroesUrl;
	}

	public void setHeroesUrl(String heroesUrl) {
		this.heroesUrl = heroesUrl;
	}

	public String getTextfile() {
		return textfile;
	}

	public void setTextfile(String textfile) {
		this.textfile = textfile;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}

package com.codingdojo.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table( name= "books" )
public class Book {
	@Id
	private Long id;
	
	@NotNull
	private String title;
	
	@NotNull
	private String descr;
	
	@NotNull
	private String lang;
	
	@NotNull
	private Integer numOfPages;
	
	public Book() {
	}
	
	public Book(Long id, String title, String descr, String lang, Integer numOfPages) {
		this.id = id;
		this.title = title;
		this.descr = descr;
		this.lang = lang;
		this.numOfPages = numOfPages;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescr() {
		return descr;
	}

	public void setDesc(String descr) {
		this.descr = descr;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public Integer getNumOfPages() {
		return numOfPages;
	}

	public void setNumOfPages(Integer numOfPages) {
		this.numOfPages = numOfPages;
	}
	
}

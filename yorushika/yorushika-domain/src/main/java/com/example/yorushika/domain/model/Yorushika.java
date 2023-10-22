package com.example.yorushika.domain.model;

import java.io.Serializable;

public class Yorushika implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String id;
	
	private String title;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}

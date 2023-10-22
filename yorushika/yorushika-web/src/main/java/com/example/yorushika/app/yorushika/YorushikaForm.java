package com.example.yorushika.app.yorushika;

import java.io.Serializable;

public class YorushikaForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}

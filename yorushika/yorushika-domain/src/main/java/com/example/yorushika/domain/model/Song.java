package com.example.yorushika.domain.model;

import java.io.Serializable;
import java.util.Date;

public class Song implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String id;
	private String title;
	private String text;
	private String url;
	private Date created;
	private String albumId;
	private String songOrder;
	
	
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

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getAlbumId() {
		return albumId;
	}

	public void setAlbumId(String albumId) {
		this.albumId = albumId;
	}

	public String getSongOrder() {
		return songOrder;
	}

	public void setSongOrder(String songOrder) {
		this.songOrder = songOrder;
	}
}

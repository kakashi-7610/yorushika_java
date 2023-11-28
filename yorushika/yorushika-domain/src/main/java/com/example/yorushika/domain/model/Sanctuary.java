package com.example.yorushika.domain.model;

import java.io.Serializable;
import java.util.Date;

public class Sanctuary implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;
	private String sanctuary;
	private String songId;
	private String text;
	private String tag;
	private Date created;
	private String image;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSanctuary() {
		return sanctuary;
	}

	public void setSanctuary(String sanctuary) {
		this.sanctuary = sanctuary;
	}

	public String getSongId() {
		return songId;
	}

	public void setSongId(String songId) {
		this.songId = songId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}

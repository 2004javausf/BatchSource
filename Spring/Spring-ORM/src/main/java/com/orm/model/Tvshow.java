package com.orm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tvshow {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;

	@Column(nullable = false)
	private String genre;

	@Column(unique = true)
	private int channel;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public Tvshow(int id, String name, String genre, int channel) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.channel = channel;
	}

	public Tvshow() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Tvshow [id=" + id + ", name=" + name + ", genre=" + genre + ", channel=" + channel + "]";
	}

}

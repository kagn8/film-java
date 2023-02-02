package com.example.filmlist.entity;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
import org.hibernate.validator.constraints.NotBlank;


@Entity
@Table(name = "movies")
public class Film {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotBlank(message = "This field is required")
	private String title;
/*	private ArrayList<Long> favorite;
	private ArrayList<Long> watched;
	private ArrayList<Long> rating;
	private Long added;*/
	private String description;
	private String thumbnail;
	private Long vote;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public Long getVote() {
		return vote;
	}
	public void setVote(Long vote) {
		this.vote = vote;
	}
	
	
	public Film() {
		super();
	}
	
	
}

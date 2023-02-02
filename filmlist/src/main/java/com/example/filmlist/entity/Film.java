package com.example.filmlist.entity;

import java.util.ArrayList;


import jakarta.persistence.*;
import org.hibernate.validator.constraints.NotBlank;


@Entity
@Table(name = "movie")
public class Film {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@NotBlank(message = "This field is required")
	private String title;
/*	private ArrayList<Long> favorite;
	private ArrayList<Long> watched;
	private ArrayList<Long> rating;*/

	@Column(name="added")
	private Long added;
	@Column(name="description")
	private String description;
	@Column(name="thumbnail")
	private String thumbnail;
	@Column(name="vote")
	private Long vote;
	
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
	public Long getAdded() {
		return added;
	}
	public void setAdded(Long added) {
		this.added = added;
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

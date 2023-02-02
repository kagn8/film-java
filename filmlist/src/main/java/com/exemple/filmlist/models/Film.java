package com.exemple.filmlist.models;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;


@Entity
public class Film {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotBlank(message = "This field is required")
	private String title;
	private ArrayList<Long> favorite;
	private ArrayList<Long> watched;
	private ArrayList<Long> rating;
	private Long added;
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
	public ArrayList<Long> getFavorite() {
		return favorite;
	}
	public void setFavorite(ArrayList<Long> favorite) {
		this.favorite = favorite;
	}
	public ArrayList<Long> getWatched() {
		return watched;
	}
	public void setWatched(ArrayList<Long> watched) {
		this.watched = watched;
	}
	public ArrayList<Long> getRating() {
		return rating;
	}
	public void setRating(ArrayList<Long> rating) {
		this.rating = rating;
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

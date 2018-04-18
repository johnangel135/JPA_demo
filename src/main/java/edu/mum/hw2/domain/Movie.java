package edu.mum.hw2.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "MOVIES")
public class Movie implements Serializable {
	private static final long serialVersionUID = 1L;

	private enum Rating {
		NONE, BAD, GOOD, EXCELLENT
	};

	private enum Category {
		COMEDY, DRAMA
	};

	@Id
	@GeneratedValue
	private int id;
	private String name;
	@Enumerated(EnumType.STRING)
	private Rating rating;
	@Enumerated(EnumType.STRING)
	private Category category;


	@ElementCollection
	private List<String> comments;

	@OneToMany
	private List<Actor> actors;
	@Lob
	private Byte[] cover;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}

	public List<Actor> getActors() {
		return actors;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}
}

package edu.mum.hw2.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ACTORS")
public class Actor {
	public Actor() {
	}

	private enum Rating {
		NONE, BAD, GOOD, EXCELLENT
	};

	@Id
	private String name;

	@Enumerated(EnumType.STRING)
	Rating rating;

	private String character;

	public Actor(String name, String character) {
		this.name = name;
		this.character = character;
	}
}

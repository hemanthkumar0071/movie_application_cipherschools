package com.example.demo.movies;
import javax.persistence.*;

import org.springframework.data.annotation.Id;

@Entity
public class Movie {
	
	
	//default constructor
	//public Movie() {}
	@Id
	private String id;
	private String name;
	private String description;
	
	public Movie(String movid, String movname , String movdescription) {
		this.id = movid;
		this.name= movname;
		this.description= movdescription;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}

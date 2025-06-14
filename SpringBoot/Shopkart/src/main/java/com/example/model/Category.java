package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Category {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	@Size(max=50)
	private String name;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "parent_category_id")
	private Category parentcategory;
	
	private String level;
	
	//Default Constructor
	public Category() {
		// TODO Auto-generated constructor stub
	}
	
	
	//Constructor using Fields
	public Category(Long id, @NotNull @Size(max = 50) String name, Category parentcategory, String level) {
		super();
		this.id = id;
		this.name = name;
		this.parentcategory = parentcategory;
		this.level = level;
	}


	//All Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getParentcategory() {
		return parentcategory;
	}

	public void setParentcategory(Category parentcategory) {
		this.parentcategory = parentcategory;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	
	
}

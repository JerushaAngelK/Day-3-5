package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student_details")

public class Details {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
	@Column(name="names")
    private String name;
	@Column(name="ranks")
    private int rank;
	public Details(int id, String name, int rank) {
		super();
		this.setId(id);
		this.setName(name);
		this.setRank(rank);
	}
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
}

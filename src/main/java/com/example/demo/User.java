package com.example.demo;

public class User {
	
	private final long id;
	private final String name;
	
	public User(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
}

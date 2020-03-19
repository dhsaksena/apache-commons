package com.dhruv.closure;

public class DTO 
{

	private int id;
	
	public DTO(int id, String name) 
	{
		super();
		this.id = id;
		this.name = name;
	}

	private String name;

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
	
}

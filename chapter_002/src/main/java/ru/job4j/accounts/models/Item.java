package ru.job4j.accounts.models;
// Элементы, пункты, ЗАЯВКА.
public class Item {
	
	private String id;
	private String name;
	private String description;
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public  void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}

	@Override
	public String toString() {
		return "Name: " + name + "\r\n" +
				"ID: " + id + "\r\n" +
				"Description: " + description + "\r\n\r\n";
	}
}

package ru.job4j.accounts;

public class Item {
	
	private String id; // id заявки.
	private String name; // Название заявки.
	
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
}

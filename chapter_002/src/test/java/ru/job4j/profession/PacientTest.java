package ru.job4j.profession;

public class Pacient {
	private String name;
	private int years;
	private String diagnoz;
	private String simptom;
	
	Pacient(String name, int years) {
		this.name = name;
		this.years = years;
	}
		
	public String getName() {
		return this.name;
	}
}

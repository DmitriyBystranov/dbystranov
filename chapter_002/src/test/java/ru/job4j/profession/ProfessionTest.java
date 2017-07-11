package ru.job4j.profession;

public class Profession {
	
	private int skillOfYears;
	private int salary;
	private int workTimeOfDay;
	private String nameProfession;
	
	Profession() {};
	Profession(int salary, int workTimeOfDay, String nameProfession) {
		this.salary = salary;
		this.workTimeOfDay = workTimeOfDay;
		this.nameProfession = nameProfession;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public int getWorkTimeOfDay() {
		return workTimeOfDay;
	}
	
	public String getNameProfession() {
		return nameProfession;
	}
	
	public int getSkillOfYears() {
		return skillOfYears;
	}
}
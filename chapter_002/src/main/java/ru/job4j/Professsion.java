package jun;

public class Profession{
	int workTimeOfLife;
	int salary;
	int workTimeOfDay;
	String nameProfession;
	
	Profession() {};
	Profession(int salary; int workTime; String nameProfession) {
		this.salary = salary;
		this.workTimeOfDay = workTimeOfDay;
		this.workTimeOfLife = workTimeOfLife;
		this.nameProfession = nameProfession;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public int getWorkTimeOfDay() {
		return workTimeOfDay;
	}
	
	public int getNameProfession() {
		return nameProfession;
	}
	
	public int getWorkTimeOfLife() {
		return workTimeOfLife;
	}
}
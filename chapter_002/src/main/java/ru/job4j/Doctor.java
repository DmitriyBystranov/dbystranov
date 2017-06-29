package ru.job4j;

public class Doctor extends Profession {
	
	private String[] specialty = {"Stomatolog, LOR, Hirurg, Med-brother"};
	private String[] knowBolezney = {"Gripp", "Halera", "Yazva"};
	private String[] simptoms = {"Kashel", "Nasmork", "Golovnaya bol"};
	Pacient misha = new Pacient("Mihail", 38);	
	public String getSpecialty(int i) {
		String specialty = this.specialty[i];
		return specialty;
	}
	
	public String getKnowBolezney(int i) {
		String knowBolezney = this.knowBolezney[i];
		return knowBolezney;
	}
	
	public void inspection(Pacient pacient) {
		System.out.println(getSpecialty(1) + " inspection " + misha.getName());
	}
}

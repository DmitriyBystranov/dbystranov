package jun;

public class Doctor extends Profession {
	
	private String specialty;
	private String[] knowBolezney = {"Gripp", "Halera", "Yazva"};
	
	public String setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	
	public String getSpecialty() {
		return specialty;
	}
	
	public String getKnowBolezney() {
		return knowBolezney;
	}
	
	public void inspection(){
		
	}
	
	public Diagnoz diagnoz(Simotoms simptoms) {
		return diagnoz;
	}
	
	public String giveRecept(Pacient pacient) {
		return recept;
	}
}

package src.maip;
public class Bahh {
	public String echo(String value){
		return String.format("%s %s %s", value, value, value);	
	}
	public static void main(String[] args){
		Bahh bah = new Bahh();
		System.out.print(bah.echo("bahh"));
	}
}
package facade;

public class Televizyon {

	private int sesSeviye;
	private int kanalNumara;
	
	public Televizyon() {
	this.kanalNumara=0;
	this.sesSeviye=0;
	
	}
	
	
	
	
	public void ac() {
		System.out.println("Televizyon acildi");
	}
	
	public void kapat() {
		System.out.println("Televizyon acildi");
	}
		
	public void sesAzalt() {
		sesSeviye--;
		System.out.println("ses seviyesi: "+sesSeviye);
	}
	
	public void sesArttir() {
		sesSeviye++;
		System.out.println("ses seviyesi: "+sesSeviye);
	}
	
	public void kanalAzalt() {
		kanalNumara--;
		System.out.println("kanal: "+kanalNumara);
	}
	
	public void kanalArttir() {
		kanalNumara++;
		System.out.println("kanal: "+kanalNumara);	}
}

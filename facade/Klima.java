package facade;

public class Klima {

	private int sicaklik;
	
	
	
	public void guncelle(int sicaklik) {
		System.out.println("sicaklik guncellendi");
		this.sicaklik=sicaklik;
	}
	
	public void ac() {
		System.out.println("Klima acildi");
	}
	
	public void kapat() {
		System.out.println("Klima kapandi");
	}
}

package facade;

public class FacadeAkilliEvSistemi {

	private Klima klima;
	private Televizyon televizyon;
	private Isik isik;
	private Kapi kapi;
	
	public FacadeAkilliEvSistemi(int isikSayisi) {
		klima=new Klima();
		televizyon=new Televizyon();
		isik =new Isik(isikSayisi);
		kapi=new Kapi();
	}
	
	public void klimaSicaklikGuncelle(int sicaklik) {
		klima.guncelle(sicaklik);
	}
	
	
	public void klimaAc() {
		klima.ac();
	}
	
	public void klimaKapat() {
		klima.kapat();
	}

	
	public void tvAc() {
		televizyon.ac();
	}
	
	public void tvKapat() {
		televizyon.kapat();
	}
		
	public void sesAzalt() {
		televizyon.sesAzalt();
	}
	
	public void sesArttir() {
		televizyon.sesArttir();
	}
	
	public void kanalAzalt() {
		televizyon.kanalAzalt();
	}
	
	public void kanalArttir() {
		televizyon.kanalArttir();
	}
	
	
	public void isikAc(int isik) {
		this.isik.ac(isik);
	}
	
	public void isikKapat(int isik) {
		this.isik.kapat(isik);
	}
	
	public void kapiKilitle() {
		kapi.kilitle();
		
	}
	
	public void kapiKilitAc() {
		kapi.kilitAc();
	}
	
	public void deneme() {
		this.isikAc(0);
		this.isikKapat(1);
		this.tvAc();
		this.kanalArttir();
		this.kanalAzalt();
		this.sesArttir();
		this.sesAzalt();
		this.tvKapat();
		this.klimaAc();
		this.klimaSicaklikGuncelle(37);
		this.klimaKapat();
		this.kapiKilitle();
		this.kapiKilitAc();
	}
	
}

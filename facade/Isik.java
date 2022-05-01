package facade;

public class Isik {
	private boolean[] durum;
	
	public Isik(int isikSayisi) {
		durum =new boolean[isikSayisi];
		//for(int i =0 ;i<isikSayisi;i++)
			//durum[i]=false;
	
	}
	
	public void ac(int isik) {
		System.out.println(isik +" . isik acildi");
		durum[isik]=true;
	}
	
	public void kapat(int isik) {
		System.out.println(isik +" . isik kapandi");
		durum[isik]=false;
	}
	
	public void kilitle() {
		System.out.println("Kapi kilitlendi");
	}
	public void kilitaAc() {
		System.out.println("Kapi kilidi acildi");
	}
	
}

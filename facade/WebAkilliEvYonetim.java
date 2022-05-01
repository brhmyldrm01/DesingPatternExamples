package facade;

public class WebAkilliEvYonetim {

FacadeAkilliEvSistemi facadeAkilliEvSistemi;
	
	public WebAkilliEvYonetim() {
		facadeAkilliEvSistemi =new FacadeAkilliEvSistemi(10);
		facadeAkilliEvSistemi.deneme();
		facadeAkilliEvSistemi.klimaSicaklikGuncelle(20);
		facadeAkilliEvSistemi.klimaAc();
		facadeAkilliEvSistemi.klimaKapat();
		facadeAkilliEvSistemi.tvAc();
		facadeAkilliEvSistemi.tvKapat();
		facadeAkilliEvSistemi.sesAzalt();
		facadeAkilliEvSistemi.sesArttir();
		facadeAkilliEvSistemi.kanalAzalt();
		facadeAkilliEvSistemi.kanalArttir();
		facadeAkilliEvSistemi.isikAc(0);
		facadeAkilliEvSistemi.isikKapat(0);
		facadeAkilliEvSistemi.kapiKilitle();
		facadeAkilliEvSistemi.kapiKilitAc();
	}
	
	
	
	
	
}

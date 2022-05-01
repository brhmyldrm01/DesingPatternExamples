package observer.example;

public class Main {

	public static void main(String[] args) {
		News news1 =new News("Ekonomi", "Dolar kuru");
		News news2 =new News("Siyaset", "Erken Secim");
		NewsAgency agency = new NewsAgency();
		Channel reuters = new Reuters();
		Channel bbc = new BBC();
		
		agency.addObserver(reuters);
		agency.addObserver(bbc);
		
		agency.setNews(news1);
		agency.setNews(news2);

	}

}

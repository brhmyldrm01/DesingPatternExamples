package observer.example;

public class BBC implements Channel{

	

	@Override
	public void breakingNews(News news) {
		System.out.print("BBC : ");
		System.out.println(news.toString());
		
	}
	
	
}

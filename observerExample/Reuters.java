package observer.example;

public class Reuters implements Channel{

	

	@Override
	public void breakingNews(News news) {
		System.out.print("Reuters : ");
		System.out.println(news.toString());
	}
	
	
}

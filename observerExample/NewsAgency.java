package observer.example;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {

	private News news;
	private List<Channel> observerChannels; 

	public NewsAgency() {
		this.news = new News();
		observerChannels= new ArrayList<Channel>();
	}

	/**
	 * @return the news
	 */
	public News getNews() {
		return news;
	}

	/**
	 * @param news the news to set
	 */
	public void setNews(News news) {
		this.news = news;
		notifyChannels();
	}

	public void notifyChannels() {
		for (Channel channel : observerChannels) {
			channel.breakingNews(this.news);
		}
	}
	
	public void addObserver(Channel channel) {
		this.observerChannels.add(channel);
	}

	public void removeObserver(Channel channel) {
		this.observerChannels.remove(channel);
	}



}

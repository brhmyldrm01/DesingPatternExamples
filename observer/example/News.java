package observer.example;

public class News {

	String header ;
	String content;	
	
	public News() {
		
	}
	
	public News(String header, String content) {
		super();
		this.header = header;
		this.content = content;
	}
	/**
	 * @return the header
	 */
	public String getHeader() {
		return header;
	}
	/**
	 * @param header the header to set
	 */
	public void setHeader(String header) {
		this.header = header;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "News [header=" + header + ", content=" + content + "]";
	}
	
	
	
}

package bridge.example2;

public abstract class Report {

	DocumentFormat documentFormat;

	public Report() {
		
	}
	
	
	public Report(DocumentFormat documentFormat) {
	
		this.documentFormat = documentFormat;
	}
	
	public abstract void display();
	
}

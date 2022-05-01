package bridge.example2;

public class PerformanceReport extends Report{

	
	public PerformanceReport() {
		
	}

	public PerformanceReport(DocumentFormat documentFormat) {
		super(documentFormat);
	}

	public void display() {
		documentFormat.create();
		System.out.println("Performance Report");
	}

	
	
}

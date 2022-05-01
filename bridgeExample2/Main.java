package bridge.example2;

public class Main {

	public static void main(String[] args) {
		
		Report empReport = new EmployeeReport(new PDFDocumentFormat());
		empReport.display();
		

	}

}

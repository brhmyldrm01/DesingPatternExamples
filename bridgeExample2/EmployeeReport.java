package bridge.example2;

public class EmployeeReport extends Report{

	public EmployeeReport() {
		
	}
	
	public EmployeeReport(DocumentFormat documentFormat) {
		super(documentFormat);
	}
	
	
	@Override
	public void display() {
		documentFormat.create();
		System.out.println("Employee Report");
	}

	
	
}

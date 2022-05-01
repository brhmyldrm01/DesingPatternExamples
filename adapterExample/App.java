package adapter.example;

public class App {

	public static void main(String[] args) {
		
		IAdapter socketAdapter = new AdapterImpl();
		Volt v3 = socketAdapter.get3Volt();
		Volt v12 = socketAdapter.get12Volt();
		Volt v120 = socketAdapter.get120Volt();
		System.out.println("v3 = "+v3.getVolts());
		System.out.println("v12 = "+v12.getVolts());
		System.out.println("v120 = "+v120.getVolts());	
		
	}

}

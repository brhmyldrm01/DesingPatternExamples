package visitor.example;

public class CanonPrinter implements Printer {

	@Override
	public void print(PC pc) {
		System.out.println("Canon printer :" + pc.getWordFile());
		
	}

	@Override
	public void print(PosDevice posDevice) {
		System.out.println("Canon printer :" + posDevice.getWpsFile());
		
	}



}

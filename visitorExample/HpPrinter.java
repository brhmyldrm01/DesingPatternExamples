package visitor.example;

public class HpPrinter implements Printer{

	@Override
	public void print(PC pc) {
		System.out.println("HP printer :" + pc.getWordFile());
	}

	@Override
	public void print(PosDevice posDevice) {
			System.out.println("HP printer :" +posDevice.getWpsFile());
		
	}

}

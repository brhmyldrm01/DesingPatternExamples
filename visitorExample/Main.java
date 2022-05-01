package visitor.example;

public class Main {

	public static void main(String[] args) {
		
		PC pc = new PC();
		PosDevice pos = new PosDevice();
		
		pc.generateFile();
		pc.accept(new CanonPrinter());
		pc.accept(new HpPrinter());
		
		pos.generateFile();
		pos.accept(new HpPrinter());
		pos.accept(new CanonPrinter());
		
	}

}

package abstractFactory.example;

public class App {

	public static void main(String[] args) {
		System.out.println("----------Abstract AbstractFactory----------------");
		AbstractFactory abstractFactory = new AbstractFactory(new ElfKingdomFactory());
		abstractFactory.getArmy().getArmy();
		abstractFactory.getCastle().getCastle();
		abstractFactory = new AbstractFactory(new OrcKingdomFactory());
		abstractFactory.getArmy().getArmy();
		abstractFactory.getCastle().getCastle();

	}

}

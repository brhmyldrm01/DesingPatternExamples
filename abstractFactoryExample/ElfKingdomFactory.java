package abstractFactory.example;

public class ElfKingdomFactory implements KingdomFactory {

	@Override
	public Castle createCastle() {
		
		return new ElfCastle();
	}

	@Override
	public Army createArmy() {
		
		return new ElfArmy();
	}

	
}

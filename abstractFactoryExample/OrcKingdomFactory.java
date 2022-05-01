package abstractFactory.example;

public class OrcKingdomFactory implements KingdomFactory {

	@Override
	public Castle createCastle() {
		
		return new OrcCastle();
	}

	@Override
	public Army createArmy() {
		
		return new OrcArmy();
	}

	
}

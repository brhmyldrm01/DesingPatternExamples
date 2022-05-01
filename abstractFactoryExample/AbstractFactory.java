package abstractFactory.example;

public class AbstractFactory {
	
	private KingdomFactory kingdomFactory;
	private Castle castle;
	private Army army;
	
	public AbstractFactory(KingdomFactory kingdomFactory) {
		this.kingdomFactory=kingdomFactory;
	}
	
	
	public Castle getCastle() {
		this.castle= kingdomFactory.createCastle();
		return castle; 
	}


	public Army getArmy() {
		this.army = kingdomFactory.createArmy();
		return army;
	}
}

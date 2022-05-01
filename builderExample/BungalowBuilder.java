package builder.example;

public class BungalowBuilder implements IHouseBuilder{

	private House house;
	
	public  BungalowBuilder() {
		house= new House();
	}
	
	
	@Override
	public void buildRoof() {
		house.setRoof("Wood  roof");
		
	}

	@Override
	public void buildBasement() {
		
		house.setBasement("No basement");
	}

	@Override
	public void buildWalls() {
		house.setWalls("Wood  walls");
		
	}

	@Override
	public House getHouse() {
		return house;
		
	}

	
}

package builder.example;

public class ApartmentBuilder implements IHouseBuilder{

	private House house;
	
	public  ApartmentBuilder() {
		house= new House();
	}
	
	
	@Override
	public void buildRoof() {
		house.setRoof("Concreate roof");
		
	}

	@Override
	public void buildBasement() {
		
		house.setBasement("Hidden basement");
	}

	@Override
	public void buildWalls() {
		house.setWalls("Brick walls");
		
	}

	@Override
	public House getHouse() {
		return house;
		
	}

	
}

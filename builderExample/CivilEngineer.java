package builder.example;

public class CivilEngineer {

	private IHouseBuilder houseBuilder;

	public CivilEngineer(IHouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	
	public void constructHouse() {
		houseBuilder.buildWalls();
		houseBuilder.buildRoof();
		houseBuilder.buildBasement();
	}
	
	public House getHouse() {
		return houseBuilder.getHouse();
	}
	
	
}

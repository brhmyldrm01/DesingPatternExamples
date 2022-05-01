package builder.example;

public class Main {

	public static void main(String[] args) {
		System.out.println("----------Builder----------------");
		CivilEngineer civilEngineer = new CivilEngineer(new ApartmentBuilder());
		civilEngineer.constructHouse();
		House house = civilEngineer.getHouse();
		System.out.println(house.toString());
		civilEngineer = new CivilEngineer(new BungalowBuilder());
		civilEngineer.constructHouse();
		house=civilEngineer.getHouse();
		System.out.println(house.toString());
		

	}

}

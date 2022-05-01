package bridge.example;


//concreateImplementor
public class DatabaseStorage implements StorageRepository {

	@Override
	public void store() {
		System.out.println("data saved to database");
		
	}
	
}

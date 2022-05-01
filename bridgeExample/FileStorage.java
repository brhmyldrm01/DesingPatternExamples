package bridge.example;


//concreateImplementor
public class FileStorage implements StorageRepository {

	@Override
	public void store() {
		System.out.println("data saved to file");
		
	}
	
}

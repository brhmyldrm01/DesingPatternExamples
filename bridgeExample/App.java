package bridge.example;

public class App {

	public static void main(String[] args) {
		
	
		BaseRepository repository= new StudentRepository(new FileStorage());
		repository.save();
		repository = new ManagerRepository(new DatabaseStorage());
		repository.save();
		
	}

}

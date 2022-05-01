package facade.example;

public class Application {

	
	public User applyTo(String name,String email,String id) {
		return new User(id,email,name);
	}
}

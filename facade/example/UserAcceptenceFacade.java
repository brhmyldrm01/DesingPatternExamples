package facade.example;

public class UserAcceptenceFacade {
	
	public void apply(String name,String email,String id) {
		Application application = new Application();
		IdAuthentication authentication=new IdAuthentication();
		EmailVerification emailVerification = new EmailVerification();
		application.applyTo(name, email, id);
		User user= application.applyTo(name, email, id);
		
		if(authentication.authenticateId(user)&& emailVerification.verifyEmail(user))
			System.out.println("User is eligible");
		else 
			System.out.println("User is not eligible");		
	}
}
package SRPOCP;

public class PremiumUser extends User{

	public PremiumUser(String name, String mail, Address address) {
		super(name, mail, address);
		// TODO Auto-generated constructor stub
	}

	public void premiumOperation() {
		System.out.println(this.getName()+" Premium operation.");
	}
	
	public PremiumUser() {
	}
	
	
}

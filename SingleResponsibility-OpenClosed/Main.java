package SRPOCP;

public class Main {

	public static void main(String[] args) {
		Address address1=new Address("Trabzon", "Of", "irfanli", 61700);
		Address address2=new Address("Trabzon", "akcaabat", "kofte", 61000);
		
		
		User user1=new User("Ýbo","ibo@gmaill.com", address1);
		User user2=new User("Ahmet","ahmet@gmasil.com",address2);
		
		
		System.out.println(user1);
		System.out.println(user2);
		
		PremiumUser premiumUser = new PremiumUser("ibo" ,"@gmail",address1 );
		
		
		premiumUser.premiumOperation();
		
		

	}

}

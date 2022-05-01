package observer;

public class Main {

	public static void main(String[] args) {
		Product product1 =  new Shoe("boots", 1221, "leather");
		Product product2 =  new Phone("iphone", 23312, "2.4 ghz");
		User user1 = new Customer("Ali") ;
		User user2 = new Admin("Ibrahim") ;    
		product1.addObserver(user1); 
		product1.addObserver(user2);
		product2.addObserver(user1);
		product2.setPrice(2332);
		product1.setPrice(54656);

	}

}

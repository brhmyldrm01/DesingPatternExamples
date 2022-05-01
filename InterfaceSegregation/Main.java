package ISP;

public class Main {

	public static void main(String[] args) {
	
		
		Product computer = new Product("Computer " , 10000);
		Product phone = new Product("Phone " , 1000);
		
		Customer sefa = new Customer("Sefa");
		Seller hakan = new Seller("hakan");
		
		
		hakan.login();
		sefa.login();
		
		hakan.addProduct(computer);
		hakan.addProduct(phone);
		
		
		sefa.productDetail(computer);
		hakan.productDetail(phone);
		
		Database.getDatabase().toString();
	}

	}

}

package ISP;

import java.util.ArrayList;
import java.util.List;


 public  class Database {

	
	private List<UserOperations> users;
	private List<Product> products;
	private static Database db = new Database();
	
	
	
	 private Database() {
		super();
		this.products=new ArrayList<Product>();
		this.users = new ArrayList<UserOperations>();
	}
	
	
	public void addUser(UserOperations user) {
		users.add(user);
	}
	
	

	public void addProduct(Product product) {
		products.add(product);
	}
	
		
	public String userstoString() {
		return "Database [users=" + users + "]";
	}


	public String productsToString() {
		return "Database [products=" + products + "]";
	}


	public static Database getDatabase() {
		return db;
	}
	
}

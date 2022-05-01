package ISP;

public class Customer implements UserOperations {

	
	private String name;
	
	
	
	public Customer(String name) {
		super();
		this.name = name;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	@Override
	public void login() {
		System.out.println("Customer Logged in ::: " + this.getName());
	
	}

	@Override
	public void productDetail(Product product) {
		System.out.println(product.toString());
	}

}

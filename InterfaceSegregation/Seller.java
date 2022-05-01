package ISP;

public class Seller implements UserOperations, SalesOperations {

	
	private String name;
	
	
	public Seller(String name) {
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
	public void addProduct(Product product) {
		System.out.println("Product Added	:" + product.toString()+ "   : Seller : " + this.getName()) ;
		Database.getDatabase().addProduct(product);
	}

	@Override
	public void login() {
		System.out.println("Seller Logged in   :" + this.getName());
	}

	@Override
	public void productDetail(Product product) {
		System.out.println(product.toString());
			}

	
}

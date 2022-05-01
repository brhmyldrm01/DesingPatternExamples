package visitor.example2;

public class Fruit implements Item{

	private String name;
	private int price;
	private int kg;
	
	
	public Fruit(String name, int price, int kg) {
		super();
		this.name = name;
		this.price = price;
		this.kg = kg;
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
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the kg
	 */
	public int getKg() {
		return kg;
	}
	/**
	 * @param kg the kg to set
	 */
	public void setKg(int kg) {
		this.kg = kg;
	}
	
	@Override
	public int accept(ShoppingCartVisitor shoppingCartVisitor) {
		return  shoppingCartVisitor.visit(this);
		
	}
	
	
		
	
	
 }

package observer;

public class Shoe extends Product {

	private String material ; 
	
	
	
	public Shoe(String name, float price, String material) {
		super(name, price);
		this.material = material;
	}



	public String getMaterial() {
		return material;
	}



	
	public void setMaterial(String material) {
		this.material = material;
	}


}

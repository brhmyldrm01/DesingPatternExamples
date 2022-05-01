package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Product {

	private String name;
	private float price;
	protected List<User> observers ;
	
	public Product(String name, float price) {
		super();
		this.name = name;
		this.price = price;
		observers =new ArrayList<User>();
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
	public float getPrice() {
		return price;
	}



	public void setPrice(float price) {
		this.price = price;
		this.sendNotification();
	}
	
	public void sendNotification() {
		for (User user : observers) {
			user.notification("Price of product " + getName() + " updated as " + getPrice());
		}
	}
	
	public void addObserver(User user) {
		observers.add(user);
	}
	
	public void removeObserver(User user) {
		observers.remove(user);
	}
	
}

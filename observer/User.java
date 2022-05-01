package observer;

import java.util.List;

public abstract class User {

	private String name;
	public User(String name) {
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




	public void notification(String message) {
		/// urun gondermek yerine musteri icerisinden string mesaj olarak gondermek baðýmlýlðý azaltýr.
		System.out.println(message);
	}

}

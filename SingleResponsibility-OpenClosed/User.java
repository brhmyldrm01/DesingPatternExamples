package SRPOCP;
public class User {

	private String name;
	private String mail;
	private Address address;
	private int id;
	
	
	User (){
		
	}
	
	public User(String name, String mail, Address address) {
		super();
		this.name = name;
		this.mail = mail;
		this.address = address;
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
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "User [name=" + name + ", mail=" + mail + ", address=" + address + ", id=" + id + "]";
	}


	
	
	
	
	
	
	
}

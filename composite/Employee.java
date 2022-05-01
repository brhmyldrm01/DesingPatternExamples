package composite;


//Component
public abstract class Employee {

	private String name;
	private String title;
	
	
	
	public abstract void showEmployeeInfo();



	public Employee(String name, String title) {
		super();
		this.name = name;
		this.title = title;
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}



	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	
	
	


	
	
}

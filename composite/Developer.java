package composite;

//Leaf
public class Developer extends Employee {

	public Developer(String name, String title) {
		super(name, title);
	
	}

	


	@Override
	public void showEmployeeInfo() {
		System.out.println("Developer : "+ getName()+  " - " + getTitle());
		
	}

	
}

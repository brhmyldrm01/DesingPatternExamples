package composite;

//Leaf
public class Designer extends Employee{

	

	public Designer(String name, String title) {
		super(name, title);
		
	}


	@Override
	public void showEmployeeInfo() {
		
		System.out.println("Designer : "+ getName()+  " - " + getTitle());
	}

	
}

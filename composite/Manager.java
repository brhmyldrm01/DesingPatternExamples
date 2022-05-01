package composite;

import java.util.ArrayList;
import java.util.List;

//Composite
public class Manager extends Employee{

	public Manager(String name, String title) {
		super(name, title);
	
	}

	private List<Employee> employees = new ArrayList<Employee >();
	
	public void add(Employee employee) {
		employees.add(employee);
	}
	
	public void remove(Employee employee) {
		employees.remove(employee);
	}

	@Override
	public void showEmployeeInfo() {
		System.out.println("Manager : "+ getName()+  " - " + getTitle());
		for(int i=0;i<employees.size();i++) {
			employees.get(i).showEmployeeInfo();
		}
		
	}
	
	
		
	

}

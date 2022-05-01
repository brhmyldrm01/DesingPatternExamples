package composite;

public class Main {

	public static void main(String[] args) {
		Designer designer1 = new Designer("Ahmet", "UI Design");
		Designer designer2 = new Designer("Fatma", "Arch. Design");
		
		Developer developer1= new Developer("Ali", " Development of Module X");
		Developer developer2= new Developer("Ayse ", " Development of Module Y");
		
		Manager developmentTeam= new Manager("Mehmet", "Software Team Lead");
		Manager designerTeam= new Manager("Zeynep", "Design Team Lead");
		
		Manager webAppTeam= new Manager("Ibrahim", "Web Apps Team Lead");
	
		designerTeam.add(designer1);
		designerTeam.add(designer2);
		
		developmentTeam.add(developer1);
		developmentTeam.add(developer2);
		
		webAppTeam.add(developmentTeam);
		webAppTeam.add(designerTeam);
		
		webAppTeam.showEmployeeInfo();
	}

}

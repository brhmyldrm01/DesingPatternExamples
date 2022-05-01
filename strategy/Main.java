package stategy;

public class Main {

	public static void main(String[] args) {
		SiteType standart = new Standart();
		SiteType weekend = new Weekend();
		SiteType christmas = new Christmas();

		ECommerceSite eComm = new ECommerceSite();
		eComm.setType(standart);
		eComm.getDesign();
		eComm.calculatePrice(1000.0);
		
		
		eComm.setType(weekend);
		eComm.getDesign();
		eComm.calculatePrice(1000.0);
		
		eComm.setType(christmas);
		eComm.getDesign();
		eComm.calculatePrice(1000.0);

	}

}

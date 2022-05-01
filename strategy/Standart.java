package stategy;

public class Standart implements SiteType {

	@Override
	public double calculatePrice(double price) {
		return price ;
	}

	@Override
	public String getDesign() {
		return "Standart Design";
	}

}

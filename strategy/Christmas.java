package stategy;

public class Christmas implements SiteType {

	@Override
	public double calculatePrice(double price) {
		return price * 0.5;
	}

	@Override
	public String getDesign() {
		return "Christmas Design";
	}

}

package stategy;

public class Weekend implements SiteType {

	@Override
	public double calculatePrice(double price) {
		return price * 0.7;
	}

	@Override
	public String getDesign() {
		return "Weekend Design";
	}

}

package visitor;

public class GalaxyTab extends Tablet{

	public GalaxyTab(String mark, String model) {
		super(mark, model);
		
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

}

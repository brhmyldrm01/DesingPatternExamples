package visitor;

public class Ipad extends Tablet {

	public Ipad(String mark, String model) {
		super(mark, model);
		
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

}

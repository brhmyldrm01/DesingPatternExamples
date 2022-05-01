package visitor;

public class Wifi implements IVisitor {
	
	private int speed;

	public Wifi(int speed) {
		super();
		this.speed = speed;
	}

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void visit(Tablet tablet) {
		if(tablet instanceof Ipad)
			System.out.println("Ipad Wifi");
		else if(tablet instanceof GalaxyTab)
			System.out.println("Galaxy Tab Wifi");
		else 
			System.out.println("other");
		
	}
	
	
	
	

}

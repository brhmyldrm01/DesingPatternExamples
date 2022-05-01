package visitor;

public class TouchScreen implements IVisitor {

	private int screenSize;

	
	public TouchScreen(int screenSize) {
		super();
		this.screenSize = screenSize;
	}

	

	/**
	 * @return the screenSize
	 */
	public int getScreenSize() {
		return screenSize;
	}



	/**
	 * @param screenSize the screenSize to set
	 */
	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}



	@Override
	public void visit(Tablet tablet) {
		if(tablet instanceof Ipad)
			System.out.println("Ipad Screen");
		else if(tablet instanceof GalaxyTab)
			System.out.println("Galaxy Tab Screen");
		else 
			System.out.println("other");
		
	}
	
	
	
	
}

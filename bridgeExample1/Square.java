package bridge.example3;

public class Square extends Shape {

	public Square () {
		
	}	
	
	public Square(Color color) {
		super(color);
	}

	@Override
	public void draw() {
		
		System.out.println("Square drawn");
		color.paint();
		
	}

}

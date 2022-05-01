package bridge.example3;

public class Circle extends Shape {

	public Circle () {
		
	}

	
	public Circle(Color color) {
		super(color);
	}

	@Override
	public void draw() {
		
		System.out.println("Circle Drawn");
		color.paint();
		
	}

}

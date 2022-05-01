package bridge.example3;

public abstract class Shape{

	Color color;

	public Shape () {
		
	}
	
	public Shape(Color color) {
		this.color = color;
	}
	
	public abstract void draw();
	
	
}

package bridge.example3;

public class Main {

	public static void main(String[] args) {
		Shape square = new Square(new Red()); 
		square.draw();
	}

}

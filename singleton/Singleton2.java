package singleton;

public class Singleton2 {
	//eager initialization
	private static Singleton2 obj2 =new Singleton2();
	
	private Singleton2() {
		
	}
	
	
	public static Singleton2 Object2() {
		return obj2;
	}
	
}

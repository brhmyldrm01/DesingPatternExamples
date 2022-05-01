package singleton;

public class Singleton1 {

	private static Singleton1 obj1;
	
	//Lazy initialization
	
	private Singleton1() {}
	
	public static Singleton1 Object1() {
		
		if(obj1==null) {
			obj1=new Singleton1();
			
		}
		return obj1;
	}
	
}

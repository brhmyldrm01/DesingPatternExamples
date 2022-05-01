package singleton;

public class Main {

	public static void main(String[] args) {
		Singleton1 singleton10=Singleton1.Object1();
		Singleton1 singleton11=Singleton1.Object1();
		
		Singleton2 singleton20=Singleton2.Object2();
		Singleton2 singleton21=Singleton2.Object2();
		
		System.out.println("singleton10: "+ singleton10);
		System.out.println("singleton11: "+ singleton11);
		System.out.println("singleton20: "+ singleton20);
		System.out.println("singleton21: "+ singleton21);

	}

}

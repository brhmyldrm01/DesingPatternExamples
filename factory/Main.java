package factory;

public class Main {

	public static void main(String[] args) {
		Factory factory = new Factory();
		String file = "Desktop/xxxx.doc";
		System.out.println(factory.compressionType("zip").compString(file));
		System.out.println(factory.compressionType("rar").compString(file));
		
		Zip zip1 =(Zip) factory.compressionType("zip");
		Rar rar1 =(Rar) factory.compressionType("rar");
		System.out.println(zip1.compString(file));
		System.out.println(rar1.compString(file));

	}

}

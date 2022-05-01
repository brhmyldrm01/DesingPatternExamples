package visitor;

public class Main {

	public static void main(String[] args) {
		Tablet galaxyTab = new GalaxyTab("samsung", "tab3");
		Tablet ipad = new Ipad("Apple", "ipad");
		
		ipad.accept(new Wifi(5));
		galaxyTab.accept(new Wifi(4));
		
		ipad.accept(new TouchScreen(14));
		galaxyTab.accept(new TouchScreen(21));
		

	}

}

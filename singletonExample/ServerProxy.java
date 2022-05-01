package singleton.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ServerProxy {
	private static ServerProxy obj;
	private static List<String> servers = new ArrayList<String>();
	private static Random rnd =new Random();
	
	
	private  ServerProxy() {
		servers.add("server_I");
		servers.add("server_II");
		servers.add("server_III");
		servers.add("server_IV");
		servers.add("server_V");
	}
	
	public static ServerProxy getServerProxy() {
		if(obj==null) {
			obj=new ServerProxy();
		}
		return obj;
	}
	
	public static String server() {
		int index=rnd.nextInt(5);
		return  servers.get(index);
	}
	
	

}

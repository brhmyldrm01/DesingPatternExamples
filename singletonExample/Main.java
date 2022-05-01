package singleton.example;

public class Main {

	public static void main(String[] args) {
		ServerProxy yd1=ServerProxy.getServerProxy();
		
		

		ServerProxy proxy =ServerProxy.getServerProxy();
		for(int i =0;i< 15;i++) {
			String server= proxy.server();
			System.out.println("Server:"+ server);
		}
	

	}

}

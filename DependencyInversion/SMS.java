package DIP;

public class SMS implements Contact {

	public void sendMessage(User user , String message) {
		System.out.println("Sms sent");
		System.out.println(message);
	}
	
}

package DIP;



public class Mail implements Contact {

	public void sendMessage(User user, String message) {
		System.out.println("Mail sent");
		System.out.println(message);
	}
	
}

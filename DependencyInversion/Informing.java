package DIP;


public class Informing {

	private SMS sms;
	private Mail mail;

	
	
	public Informing(SMS sms, Mail mail) {
		super();
		this.sms = sms;
		this.mail = mail;
	}

	public void bilgilendir(User user, String message) {
		mail.sendMessage(user, message);
		sms.sendMessage(user, message);
	
	}


}

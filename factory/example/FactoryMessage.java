package factory.example;

public class FactoryMessage {

	public MessageBuilder getMessageBuilder(String type) {
		switch (type) {
		case "sms": return new SmsBuilder();
		case "mail": return new MailBuilder();
		default: return null;
		}
	}
}

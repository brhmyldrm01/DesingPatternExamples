package factory.example;

public class SmsBuilder implements MessageBuilder {
	@Override
	public void build() {
		System.out.println("Sms message");
	}

}

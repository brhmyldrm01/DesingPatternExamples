package factory.example;

public class MailBuilder implements MessageBuilder {

	@Override
	public void build() {
		System.out.println("mail message ");
	}

	
}

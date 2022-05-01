package factory.example;

public class Main {

	public static void main(String[] args) {
		
		FactoryMessage fm=new FactoryMessage();
		fm.getMessageBuilder("sms").build();
		fm.getMessageBuilder("mail").build();
	}

}

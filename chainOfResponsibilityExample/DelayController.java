package chainOfResponsibility;

public class DelayController extends BaseController{

	private int delay;
	
	
	@Override
	public boolean control(CreditCustomer creditCustomer) {
		delay=3;
		return creditCustomer.getDelay()<=delay;
	}

	
	
	
}

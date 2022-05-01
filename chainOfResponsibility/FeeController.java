package chainOfResponsibility;

public class FeeController extends BaseController{

	

	@Override
	public boolean control(CreditCustomer creditCustomer) {
		return creditCustomer.isFee();
	}	
	
	
	
	
}

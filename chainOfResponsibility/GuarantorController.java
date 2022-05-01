package chainOfResponsibility;

public class GuarantorController extends BaseController{
	
	
	@Override
	public boolean control(CreditCustomer creditCustomer) {
		return creditCustomer.isGuarantor();
	}	
	
}

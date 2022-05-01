package chainOfResponsibility;

public class CreditScoreController extends BaseController{

	private int creditScore;
	
	
	@Override
	public boolean control(CreditCustomer creditCustomer) {
		creditScore=1500;
		System.out.println( creditCustomer.getScore()>=creditScore );
		return creditCustomer.getScore()>=creditScore ;
	}

	
	
	
}

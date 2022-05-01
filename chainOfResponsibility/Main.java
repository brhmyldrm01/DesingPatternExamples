package chainOfResponsibility;

public class Main {

	public static void main(String[] args) {
		CreditCustomer customer = new CreditCustomer("ibrahim", "1212121212", 2000, 0, true, true);
		
		BaseController creditScoreController=new CreditScoreController();
	    BaseController delayController = new DelayController();
	    BaseController guarantorController = new GuarantorController();
	    BaseController feeController = new FeeController();
	
		
		creditScoreController.setNext(delayController);
		delayController.setNext(guarantorController);
		guarantorController.setNext(feeController);
		customerControl(creditScoreController, customer);
	}

	public static void customerControl(BaseController kredi, CreditCustomer customer) {
		
		if(kredi.run(customer))
			System.out.println("Dear :" + customer.getName() + " credit approved.");
		else
			System.out.println("Dear :" + customer.getName() + " credit denied.");
		
	}
}

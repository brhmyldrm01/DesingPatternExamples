package chainOfResponsibility;

public abstract class BaseController {

	
	private BaseController nextController;
	
	


	/**
	 * @return the nextController
	 */
	public BaseController getNextController() {
		return nextController;
	}

	public void setNext(BaseController nextController) {
		this.nextController = nextController;
	}
	
	public boolean run(CreditCustomer creditCustomer) {
		
			if(control(creditCustomer)) {
				if(getNextController() != null) 
						return this.nextController.run(creditCustomer);
				else
					return this.control(creditCustomer);
					
			}	
			return false;
	}
	
	public abstract boolean control(CreditCustomer creditCustomer) ;
	
	
	
}

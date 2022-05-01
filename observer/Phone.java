package observer;

public class Phone extends Product {

	private String processor;
	


	public Phone(String name, float price, String processor) {
		super(name, price);
		this.processor = processor;
	}



	/**
	 * @return the processor
	 */
	public String getProcessor() {
		return processor;
	}



	/**
	 * @param processor the processor to set
	 */
	public void setProcessor(String processor) {
		this.processor = processor;
	}

	


}

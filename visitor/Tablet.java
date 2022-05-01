package visitor;

public abstract class Tablet {

	private String mark;
	private String model;
	
	public Tablet(String mark, String model) {
		super();
		this.mark = mark;
		this.model = model;
	}
 
	public abstract void accept(IVisitor visitor);
	
	/**
	 * @return the mark
	 */
	public String getMark() {
		return mark;
	}

	/**
	 * @param mark the mark to set
	 */
	public void setMark(String mark) {
		this.mark = mark;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	
	
	
	
	
}

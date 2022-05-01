package chainOfResponsibility;

public class CreditCustomer {

	private String name;
	private String id;
	private int score;
	private int delay;
	private boolean guarantor;
	private boolean fee;
	
	public CreditCustomer(String name, String id, int score, int delay, boolean guarantor, boolean fee) {
		super();
		this.name = name;
		this.id = id;
		this.score = score;
		this.delay = delay;
		this.guarantor = guarantor;
		this.fee = fee;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}

	/**
	 * @return the delay
	 */
	public int getDelay() {
		return delay;
	}

	/**
	 * @param delay the delay to set
	 */
	public void setDelay(int delay) {
		this.delay = delay;
	}

	/**
	 * @return the guarantor
	 */
	public boolean isGuarantor() {
		return guarantor;
	}

	/**
	 * @param guarantor the guarantor to set
	 */
	public void setGuarantor(boolean guarantor) {
		this.guarantor = guarantor;
	}

	/**
	 * @return the fee
	 */
	public boolean isFee() {
		return fee;
	}

	/**
	 * @param fee the fee to set
	 */
	public void setFee(boolean fee) {
		this.fee = fee;
	}

	
	
	
	
	
}

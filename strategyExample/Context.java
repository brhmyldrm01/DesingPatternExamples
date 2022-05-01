package strategy.example;

public class Context {
	
	private OperationStrategy operationStrategy;

	
	public Context() {
	}

	/**
	 * @return the operationStrategy
	 */
	public OperationStrategy getOperationStrategy() {
		return operationStrategy;
	}

	/**
	 * @param operationStrategy the operationStrategy to set
	 */
	public void setOperationStrategy(OperationStrategy operationStrategy) {
		this.operationStrategy = operationStrategy;
	}

	public int executeStrategy(int num1, int num2){
	      return operationStrategy.operation(num1, num2);
	   }
	
}

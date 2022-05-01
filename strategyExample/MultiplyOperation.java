package strategy.example;

public class MultiplyOperation implements OperationStrategy{

	@Override
	public int operation(int num1, int num2) {
		
		return num1 * num2 ;
	}

}

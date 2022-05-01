package strategy.example;

public class SubstractOperation implements OperationStrategy{

	@Override
	public int operation(int num1, int num2) {
		
		return num1 - num2 ;
	}

}

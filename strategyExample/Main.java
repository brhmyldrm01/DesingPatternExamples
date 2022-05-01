package strategy.example;

public class Main {

	public static void main(String[] args) {
		OperationStrategy multiply = new MultiplyOperation();
		OperationStrategy add = new AddOperation();
		OperationStrategy substract = new SubstractOperation();
		
		Context context = new Context();
		
		context.setOperationStrategy(multiply);
		System.out.println(context.executeStrategy(10, 2));	
		
		context.setOperationStrategy(add);
		System.out.println(context.executeStrategy(10, 2));	
		
		context.setOperationStrategy(substract);
		System.out.println(context.executeStrategy(10, 2));	

	}

}

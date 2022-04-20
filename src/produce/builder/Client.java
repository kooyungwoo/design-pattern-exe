package produce.builder;

public class Client {
	//빌더 패턴
	public static void main(String[] args) {
		int firstNumber = 100;
		int secondNumber = 20;
		
		AbstractOperationBuilder[] operationBuilder = new AbstractOperationBuilder[4];
		
		operationBuilder[0] = new AddOperationBuilder(firstNumber, secondNumber);
		operationBuilder[1] = new SubstractOperationBuilder(firstNumber, secondNumber);
		operationBuilder[2] = new MultiplyOperationBuilder(firstNumber, secondNumber);
		operationBuilder[3] = new DivideOperationBuilder(firstNumber, secondNumber);
		
		for(int i=0; i<operationBuilder.length; i++) {
			OperationDirector operationDirector = new OperationDirector(operationBuilder[i]);
			operationDirector.construct();
		}
	}

}

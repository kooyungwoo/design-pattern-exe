package produce.factory;


public class Client {
	
	public static void main(String[] args) throws Exception {
		
		OperationFactory operationFactory = new OperationFactory();
		
		int firstNumber = 100;
		int secondNumber = 20;
		
		String[] operators = {"+", "-", "*", "/"};
		
		for(int i = 0; i < operators.length; i++){
			AbstractOperationProduct operationProduct = operationFactory.createOperationProduct(operators[i]);				
			operationProduct.operate(firstNumber, secondNumber);
		}
		
	}

}

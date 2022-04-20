package produce.singleton;

public class Client {
	//싱글톤 패턴
	public static void main(String[] args) {
		OperationSigleton operationSigleton = OperationSigleton.getInstance();
		
		int firstNumber = 100;
		int secondNumber = 20;
		
		operationSigleton.operate(operationSigleton.ADD_OPERATION, firstNumber, secondNumber);
		operationSigleton.operate(operationSigleton.SUBSTRACT_OPERATION, firstNumber, secondNumber);
		operationSigleton.operate(operationSigleton.DIVIDE_OPERATION, firstNumber, secondNumber);
		operationSigleton.operate(operationSigleton.MULTIPLY_OPERATION, firstNumber, secondNumber);
	}

}

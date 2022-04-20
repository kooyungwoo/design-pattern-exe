package produce.singleton;

public class OperationSigleton {
	public static final int ADD_OPERATION=1;
	public static final int SUBSTRACT_OPERATION=2;
	public static final int MULTIPLY_OPERATION=3;
	public static final int DIVIDE_OPERATION=4;
	
	private static OperationSigleton singleton = new OperationSigleton();
	
	private OperationSigleton() {
		super();
	}
	
	public static OperationSigleton getInstance() {
		return singleton;
	}
	
	public void operate(int operatorType, int firstNumber, int secondNumber) {
		int answer = 0;
		String operator = null;
		
		switch(operatorType) {
			case ADD_OPERATION:
					answer = firstNumber+secondNumber;
					operator = "+";
			break;
			case SUBSTRACT_OPERATION:
					answer = firstNumber-secondNumber;
					operator = "-";
			break;
			case MULTIPLY_OPERATION:
					answer = firstNumber*secondNumber;
					operator = "*";
			break;
			case DIVIDE_OPERATION:
					answer = firstNumber/secondNumber;
					operator = "/";
			break;
		}
		String result = firstNumber+operator+secondNumber+" = "+answer;
		
		print(result);
	}
	
	public void print(String result) {
		System.out.println(result);
	}
}

package structure.proxy;

//프록시 패턴
//어떤 객체의 접근을 제어하는 대리 객체를 제공하여 다양한 선행처리(접근제한, 케이시용 등)을 하는 패턴
public class Client {

	public static void main(String[] args) throws Exception{

		int firstNumber = 100;
		int secondNumber = 20;
		
		int result;
		
		//+, -, * 는 프록시 패턴이 아님
		AbstractOperationSubject operationSubject = new AddOperationSubject();				
		result = operationSubject.operate(firstNumber, secondNumber);
		
		System.out.println(firstNumber + " + " + secondNumber + " = " + result);
		
		operationSubject = new SubstractOperationSubject();				
		result = operationSubject.operate(firstNumber, secondNumber);
		
		System.out.println(firstNumber + " - " + secondNumber + " = " + result);
		
		operationSubject = new MultiplyOperationSubject();				
		result = operationSubject.operate(firstNumber, secondNumber);
		
		System.out.println(firstNumber + " * " + secondNumber + " = " + result);
		
		//아래 내용이 프록시 패턴에 해당
		operationSubject = new DivideOperationProxy(new DivideOperationSubject());		
		result = operationSubject.operate(firstNumber, secondNumber);
		
		System.out.println(firstNumber + " / " + secondNumber + " = " + result);

		//값을 검증하는 프록시를 만들었기 때문에 secondNumber이 0 인경우 검증 과정을 아래 소스를 통해 확인 할 수 있습니다.
		operationSubject = new DivideOperationProxy(new DivideOperationSubject());

		firstNumber = 10;
		secondNumber = 0;

		try {
			result = operationSubject.operate(firstNumber, secondNumber);
			
			System.out.println(firstNumber + " / " + secondNumber + " = " + result);
		} catch (OperationException e) {			
			System.out.println(e.toString());
		}
		
	}

}

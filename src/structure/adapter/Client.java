package structure.adapter;

//어뎁터 패턴
public class Client {

	public static void main(String[] args) {

		int firstNumber = 100;
		int secondNumber = 20;

		//기존 클래스와 동일한 구조로 추상클래스 생성 및 사용 operate(firstNumber, secondNumber)
		AbstractOperationTarget operationTarget = new AddOperation();

		int answer = operationTarget.operate(firstNumber, secondNumber);

		System.out.println(firstNumber + " + " + secondNumber + " = " + answer);

		operationTarget = new SubstractOperation();
		answer = operationTarget.operate(firstNumber, secondNumber);

		System.out.println(firstNumber + " - " + secondNumber + " = " + answer);

		operationTarget = new MultiplyOperation();
		answer = operationTarget.operate(firstNumber, secondNumber);

		System.out.println(firstNumber + " * " + secondNumber + " = " + answer);

		//나누기는 기존 클래스
		OperationAdaptee operationAdaptee = new OperationAdaptee();

		//DivideOperationAdapter 을 이용해서 기존 클래스를 AbstractOperationTarget에 맞춰서 동작 할 수 있게 구현
		//operationTarget 은 calculate 을 호출해야 계산이 이루어짐 신규는 operate 시 계산이 이루어짐
		//DivideOperationAdapter는 operate가 호출 되면 기존 클래스의 calculate가 동작하게 연결 해줌
		operationTarget = new DivideOperationAdapter(operationAdaptee);
		answer = operationTarget.operate(firstNumber, secondNumber);

		System.out.println(firstNumber + " / " + secondNumber + " = " + answer);

	}

}

package behavioral.observer;

//옵저버 패턴
/*
 * 한 객체의 상태가 변하면 그 상태에 의존하는 여러 객체들에게 상태의 변화를 통지하는(알려주는)패턴
 * 
 * 한 객체의 상태가 변경되면 그 객체와 연관된 여러 객체에도 변경이 요구된다.
 * 한 객체와 연관된 다수의 객체가 통신한다.(일대다 통신)
 * 객체의 상태가 변경 되었다면 메시지는 단방향으로 흐른다.
 * 변화를 감지하는 클래스의 종류가 유동적이다.
 * 
 * 상태가 바뀌는 특정 객체와 상태변화를 반영해야 하는 객체 사이의 결합도를 약하게 만들어 준다.
 * 상태 변화를 반영하는 객체를 언제든지 추가하거나 삭제 할 수 있다.
*/
public class Client {

	public static void main(String[] args) {
		//전파할 상태를 가지고 전파 하는 class
		OperationSubject operationSubject = new OperationSubject();

		//사칙 연산 구현을 위한 class 생성, 생성시 OperationSubject을 주입
		AddOperationObserver addObserver = new AddOperationObserver(operationSubject);
		SubstractOperationObserver substractObserver = new SubstractOperationObserver(operationSubject);
		MultiplyOperationObserver multiplyObserver = new MultiplyOperationObserver(operationSubject);
		DivideOperationObserver divideObserver = new DivideOperationObserver(operationSubject);

		operationSubject.registerObserver(addObserver);
		operationSubject.registerObserver(substractObserver);
		operationSubject.registerObserver(multiplyObserver);
		operationSubject.registerObserver(divideObserver);

		int firstNumber = 100;
		int secondNumber = 20;

		//상태 변경을 저장 및 전파
		operationSubject.setNumber(firstNumber, secondNumber);

		firstNumber = 200;
		secondNumber = -30;

		//상태 변경을 저장 및 전파
		operationSubject.setNumber(firstNumber, secondNumber);

	}

}

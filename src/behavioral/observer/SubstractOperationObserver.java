package behavioral.observer;

public class SubstractOperationObserver extends AbstractOperationObserver {

	public SubstractOperationObserver(OperationSubject operationSubject) {
		super(operationSubject);
	}

	//사칙 연산 수행
	@Override
	public void update() {

		int firstNumber = getFirstNumber();
		int secondNumber = getSecondNumber();

		int answer = firstNumber - secondNumber;

		System.out.println(firstNumber + " - " + secondNumber + " = " + answer);
	}

}

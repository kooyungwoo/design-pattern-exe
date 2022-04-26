package behavioral.observer;

/*
 *  subject로 부터 상태 변화를 통보 받는다
 *  subject로 부터 상태 변화를 통보 받을때 호출되는 메서드(update)를 선언한다.
 * */
public abstract class AbstractOperationObserver {
	//firstNumber, secondNumber 2개의 값이 변경되면 전달 받아야 하기 때문에 OperationSubject 을 전달 받는다.
	private OperationSubject operationSubject;

	
	public AbstractOperationObserver(OperationSubject operationSubject) {
		this.operationSubject = operationSubject;
	}

	//계산이 실행되는 추상 메서드 사칙 연산 class에서 구현
	public abstract void update();

	//계산시 사용할 firstNumber 값을 가지고 옵니다.(operationSubject로 부터 데이터를 수신)
	protected final int getFirstNumber() {
		return operationSubject.getFirstNumber();
	}

	//계산시 사용할 secondNumber 값을 가지고 옵니다.(operationSubject로 부터 데이터를 수신)
	protected final int getSecondNumber() {
		return operationSubject.getSecondNumber();
	}
}

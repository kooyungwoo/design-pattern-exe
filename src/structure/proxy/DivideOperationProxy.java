package structure.proxy;

//프록시 패턴에 사용되는 프록시 DivideOperationSubject 을 연결하기 위한 역활을 한다
//operate(계산) 메소드 호출 시 secondNumber 값의 정상 여부를 판단하고 정상인 경우 계산을 정상이 아닌경우 에러를 만들어서
//넘겨 준다
public class DivideOperationProxy extends AbstractOperationSubject {

	private AbstractOperationSubject realOperationSubject;

	public DivideOperationProxy(AbstractOperationSubject realOperationSubject) {
		this.realOperationSubject = realOperationSubject;
	}

	public int operate(int firstNumber, int secondNumber) throws OperationException {
		//프록시 패턴은 구현체를 호출 하기 전에 접근제어, 검증등의 추가 작업을 하기 위해 사용 합니다.
		if (secondNumber == 0) {
			throw new OperationException("NonZeroDivideException");
		}

		return realOperationSubject.operate(firstNumber, secondNumber);
	}

}

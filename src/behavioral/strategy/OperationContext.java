package behavioral.strategy;

/*
 * Strategy 인스턴스를 가지고 있습니다.
 * Strategy 인터페이스를 이용하여 기능을 수행 합니다.
 * 실시간으로 구체적인 전략을 변경 하기 위해 setter메소드를 제공 합니다.
 * */
public class OperationContext {

	private AbstractOperationStrategy operationStrategy;

	public OperationContext() {
		super();
	}

	//AbstractOperationStrategy에 설정된 인스턴스의 4칙연산 관련 메소드를 실행
	//setter 메서드를 이용해서 수행되는 operate를 변경
	public void operate(int firstNumber, int secondNumber) {
		int answer = operationStrategy.getAnswer(firstNumber, secondNumber);

		String operator = operationStrategy.getOperator();

		String result = firstNumber + operator + secondNumber + "=" + answer;

		print(result);
	}

	//실시간으로 구체적인 전략을 변경 하기 위한 setter 메서드(4칙연산이 필요한 경우에 맞춰서 인스턴스 전달)
	public void setOperationStrategy(AbstractOperationStrategy operationStrategy) {
		this.operationStrategy = operationStrategy;
	}

	public void print(String result) {
		System.out.println(result);
	}

}

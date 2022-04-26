package behavioral.strategy;

//strategy인터페이스 구현체
public class MultiplyOperationStrategy extends AbstractOperationStrategy {

	public int getAnswer(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;
	}

	@Override
	public String getOperator() {
		return "*";
	}

}

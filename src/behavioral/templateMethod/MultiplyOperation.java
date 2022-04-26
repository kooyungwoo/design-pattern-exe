package behavioral.templateMethod;

//추상 메서드 구현
public class MultiplyOperation extends AbstractOperation {

	protected int getAnswer(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;
	}

	@Override
	protected String getOperator() {
		return "*";
	}

}

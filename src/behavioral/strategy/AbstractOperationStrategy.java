package behavioral.strategy;

//strategy 인터페이스
public abstract class AbstractOperationStrategy {

	public abstract int getAnswer(int firstNumber, int secondNumber);

	public abstract String getOperator();

}

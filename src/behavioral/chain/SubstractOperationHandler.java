package behavioral.chain;

public class SubstractOperationHandler extends AbstractOperationHandler {

	public SubstractOperationHandler(String operator) {
		super(operator);
	}

	@Override
	protected int operate(Request request) {
		String operator = getOperator();

		int firstNumber = request.getFirstNumber(operator);
		int secondNumber = request.getSecondNumber(operator);

		return firstNumber - secondNumber;
	}

}

package structure.adapter;

public class DivideOperationAdapter extends AbstractOperationTarget {

	protected OperationAdaptee operationAdaptee;

	public DivideOperationAdapter(OperationAdaptee operationAdaptee) {
		this.operationAdaptee = operationAdaptee;
	}

	public int operate(int firstNumber, int secondNumber) {
		return operationAdaptee.calculate(OperationAdaptee.DIVIDE_OPERATION, firstNumber, secondNumber);
	}

}

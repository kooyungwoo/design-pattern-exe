package produce.prototype;

public class SubstractOperationPrototype extends AbstractOperationPrototype {
	public SubstractOperationPrototype() {
		super();
	}
	
	public SubstractOperationPrototype(AbstractOperationPrototype operation) {
		super(operation);
	}
	
	@Override
	public AbstractOperationPrototype getClone() {
		return new SubstractOperationPrototype(this);
	}

	@Override
	protected int getAnswer(int firstNumber, int scondNumber) {
		return firstNumber-scondNumber;
	}

	@Override
	protected String getOperator() {
		return " - ";
	}

}

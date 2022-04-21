package produce.prototype;

public class MultiplyOperationPrototype extends AbstractOperationPrototype {
	public MultiplyOperationPrototype() {
		super();
	}
	
	public MultiplyOperationPrototype(AbstractOperationPrototype operation) {
		super(operation);
	}
	
	@Override
	public AbstractOperationPrototype getClone() {
		return new MultiplyOperationPrototype(this);
	}

	@Override
	protected int getAnswer(int firstNumber, int scondNumber) {
		return firstNumber*scondNumber;
	}

	@Override
	protected String getOperator() {
		return " * ";
	}

}

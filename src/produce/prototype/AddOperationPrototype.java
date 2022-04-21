package produce.prototype;

public class AddOperationPrototype extends AbstractOperationPrototype {
	public AddOperationPrototype() {
		super();
	}
	
	public AddOperationPrototype(AbstractOperationPrototype operation) {
		super(operation);
	}
	
	@Override
	public AbstractOperationPrototype getClone() {
		return new AddOperationPrototype(this);
	}

	@Override
	protected int getAnswer(int firstNumber, int scondNumber) {
		return firstNumber+scondNumber;
	}

	@Override
	protected String getOperator() {
		return " + ";
	}

}

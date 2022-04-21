package produce.prototype;

public class DivideOperationPrototype extends AbstractOperationPrototype {
	public DivideOperationPrototype() {
		super();
	}
	
	public DivideOperationPrototype(AbstractOperationPrototype operation) {
		super(operation);
	}
	
	@Override
	public AbstractOperationPrototype getClone() {
		return new DivideOperationPrototype(this);
	}

	@Override
	protected int getAnswer(int firstNumber, int scondNumber) {
		return firstNumber/scondNumber;
	}

	@Override
	protected String getOperator() {
		return " / ";
	}

}

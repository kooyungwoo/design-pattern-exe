package produce.builder;

public class AddOperationBuilder extends AbstractOperationBuilder {
	
	public AddOperationBuilder(int firstNumber, int secondNumber) {
		super(firstNumber, secondNumber);
	}
	
	@Override
	public int operate(int firstNumber, int secondNumber) {
		return firstNumber+secondNumber;
	}

	@Override
	public void buildOperator() {
		result.append(" + ");
	}

}

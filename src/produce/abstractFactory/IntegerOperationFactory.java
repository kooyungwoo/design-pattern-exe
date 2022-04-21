package produce.abstractFactory;

public class IntegerOperationFactory extends AbstractOperationFactory{

	@Override
	public AbstractOperationProduct createOperationProduct() {		
		return new IntegerOperationProduct();
	}

	@Override
	public AbstractNumberOperandProduct createNumberOperandProduct(String value) {
		return new IntegerNumberOperandProduct(value);
	}

}

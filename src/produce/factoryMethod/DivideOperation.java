package produce.factoryMethod;

public class DivideOperation extends AbstractOperation {

	@Override
	protected AbstractOperator getOperator() {
		return new DivideOperator();
	}

}

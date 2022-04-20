package produce.factoryMethod;

public class SubstractOperation extends AbstractOperation {

	@Override
	protected AbstractOperator getOperator() {
		return new SubstractOperator();
	}

}

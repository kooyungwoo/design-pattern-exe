package produce.factoryMethod;

public class AddOperation extends AbstractOperation {

	//+ 에 해당하는 계산 클래스 정의
	@Override
	protected AbstractOperator getOperator() {
		return new AddOperator();
	}

}

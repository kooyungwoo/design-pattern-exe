package structure.facade;

import produce.factory.AbstractOperationProduct;
import produce.factory.OperationFactory;

//퍼사드 클래스 계산하는 클래스를 여기에서 호출
//팩토리 패턴의 계산 함수를 호출 해서 구현
public class CalculatorFacade {

	public CalculatorFacade() {
		super();
	}

	public void calculate(String expression) {
		//퍼사드 패턴과 상관은 없는 구현 부분(구현을 복잡하게 만들기 위해서 추가 한듯)
		//넘겨 받은 수식을 잘라서 계산시 사용할 변수에 셋팅
		ExpressionParser expressionParser = new ExpressionParser();
		expressionParser.parse(expression);

		String operatorToken = expressionParser.getOperatorToken();

		String firstNumberToken = expressionParser.getFirstNumberToken();
		String secondNumberToken = expressionParser.getSecondNumberToken();

		//퍼사드 패턴과 상관 없는 부분 문자->숫자로 변경하는 부분(구현을 복잡하게 만들기 위해서 추가 한듯)
		NumberOperand firstNumberOperand = new NumberOperand(firstNumberToken);
		NumberOperand secondNumberOperand = new NumberOperand(secondNumberToken);

		int firstNumber = firstNumberOperand.getNumber();
		int secondNumber = secondNumberOperand.getNumber();

		//팩토리 패턴을 이용해서 계산 부분 구현 퍼사드 패턴을 이용하는 경우 호출 하는 부분에서는 안의 복잡한 구현 부분을 신경쓰지 않고
		//호출 하며 구현 부분 변경이 호출 부분에 영향을 미치지 않습니다.
		OperationFactory operationFactory = new OperationFactory();
		AbstractOperationProduct operationProduct = operationFactory.createOperationProduct(operatorToken);

		operationProduct.operate(firstNumber, secondNumber);
	}

}

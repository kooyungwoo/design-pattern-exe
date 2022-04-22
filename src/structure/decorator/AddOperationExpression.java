package structure.decorator;

public class AddOperationExpression extends AbstractOperationExpression {

	//ArrayList<AbstractExpression> operandList 의 정보를 가지고 와서 더하기 구현
	public double operate() {
		AbstractExpression firstOperandExpression = operandList.get(0);
		AbstractExpression secondOperandExpression = operandList.get(1);

		double firstResult = firstOperandExpression.operate();
		double secondResult = secondOperandExpression.operate();

		return firstResult + secondResult;
	}

}

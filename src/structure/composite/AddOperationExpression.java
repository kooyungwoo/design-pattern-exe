package structure.composite;

public class AddOperationExpression extends AbstractOperationExpression {

	//ArrayList<AbstractExpression> operandList 의 정보를 가지고 와서 더하기 구현
	public int operate() {
		AbstractExpression firstOperandExpression = operandList.get(0);
		AbstractExpression secondOperandExpression = operandList.get(1);

		int firstResult = firstOperandExpression.operate();
		int secondResult = secondOperandExpression.operate();

		return firstResult + secondResult;
	}

}

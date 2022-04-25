package behavioral.chain;

//수식을 받기 위한 class
//계산을 위한 수와 계산식 정보를 넘겨 줍니다.
public final class Request {

	private String expression;

	public Request(String expression) {
		this.expression = expression;
	}

	public String getExpression() {
		return expression;
	}

	public int getFirstNumber(String operator) {
		int operatorIndex = expression.indexOf(operator);
		
		String firstNumber = expression.substring(0, operatorIndex);
		return Integer.parseInt(firstNumber);
	}

	public int getSecondNumber(String operator) {
		int operatorIndex = expression.indexOf(operator);
		
		String secondNumber = expression.substring(operatorIndex + 1);
		return Integer.parseInt(secondNumber);
	}

}

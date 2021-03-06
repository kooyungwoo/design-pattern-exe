package structure.composite;

//구현된 AbstractExpression class에 대한 operate 실행을 담당
public class Calculator {

	private AbstractExpression expression;

	public Calculator() {
		super();
	}

	public int calculate() {
		return expression.operate();
	}

	public void setExpression(AbstractExpression expression) {
		this.expression = expression;
	}
}

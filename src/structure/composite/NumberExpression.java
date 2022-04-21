package structure.composite;


public class NumberExpression extends AbstractExpression {

	private int value;

	public NumberExpression(int value) {
		this.value = value;
	}

	public int operate() {
		return value;
	}

}

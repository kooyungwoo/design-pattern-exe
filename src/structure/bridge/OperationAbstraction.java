package structure.bridge;

/*
 * 기본적인 사칙연산을 기술 bridge를 통해서 기능을 확장한다
 * 여기 기술된 내용은 변동 되지 않을거 같은 내용이다.
 */
public class OperationAbstraction {

	private IBaseOperationImplementor impl;

	public OperationAbstraction(IBaseOperationImplementor impl) {
		this.impl = impl;
	}

	public int add(int firstNumber, int secondNumber) {
		return this.impl.add(firstNumber, secondNumber);
	}

	public int substract(int firstNumber, int secondNumber) {
		return this.impl.substract(firstNumber, secondNumber);
	}

	public int multiply(int firstNumber, int secondNumber) {
		return this.impl.multiply(firstNumber, secondNumber);
	}

	public int divide(int firstNumber, int secondNumber) {
		return this.impl.divide(firstNumber, secondNumber);
	}

}

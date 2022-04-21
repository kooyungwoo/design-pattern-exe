package structure.bridge;

/*
 *bridge 역활을 한다 BaseOperation 로 인터페이스가 구현되고
 *OperationAbstraction 와 RefinedOperationAbstraction 은 IBaseOperationImplementor을 매게로 연결 된다.
 * */
public interface IBaseOperationImplementor {

	public abstract int add(int firstNumber, int secondNumber);

	public abstract int substract(int firstNumber, int secondNumber);

	public abstract int multiply(int firstNumber, int secondNumber);

	public abstract int divide(int firstNumber, int secondNumber);

}

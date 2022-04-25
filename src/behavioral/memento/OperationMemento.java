package behavioral.memento;

//기억 class 특정 시점의 정보를 받아 저장 하고 있다 원할때 돌려 줍니다.
public class OperationMemento {

	private int firstNumber;
	private int secondNumber;

	public OperationMemento(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	public int getFirstNumber() {
		return firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

}

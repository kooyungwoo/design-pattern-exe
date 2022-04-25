package behavioral.memento;

//기본 class
public class OperationOriginator {

	private int firstNumber;
	private int secondNumber;

	//특정 시점의 정보를 OperationMemento에 넘겨 저장
	public OperationMemento createMemento() {
		return new OperationMemento(firstNumber, secondNumber);
	}

	//특정 시점을 저장한 OperationMemento 에게서 정보를 전달 받아 복구
	public void setMemento(OperationMemento memento) {
		this.firstNumber = memento.getFirstNumber();
		this.secondNumber = memento.getSecondNumber();
	}

	//계산
	public void printOperations() {
		System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
		System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
		System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
		System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
}

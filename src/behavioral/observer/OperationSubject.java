package behavioral.observer;

import java.util.ArrayList;

/*
 * subject를 구현한 구현체
 * */
public class OperationSubject implements ISubject {

	private int firstNumber; //상태 변경 대상
	private int secondNumber; //상태 변경 대상

	//계산에 사용될 
	private ArrayList<AbstractOperationObserver> observers = new ArrayList<AbstractOperationObserver>();

	public OperationSubject() {
		super();
	}

	//상태를 전달 받을 객체를 추가
	public void registerObserver(AbstractOperationObserver oberver) {
		observers.add(oberver);
	}

	//상태를 전달 받을 객체를 삭제
	public void removeObserver(AbstractOperationObserver oberver) {
		int index = observers.indexOf(oberver);
		if (index >= 0) {
			observers.remove(index);
		}
	}

	//상태 변경 상태를 전파
	public void notifyObservers() {
		AbstractOperationObserver oberver = null;
		for (int i = 0; i < observers.size(); i++) {
			oberver = observers.get(i);
			oberver.update();
		}
	}

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setNumber(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		
		//상태 값이 변경되면 상태 전파를 위한 메소드를 호출
		notifyObservers();
	}

	public int getSecondNumber() {
		return secondNumber;
	}

}

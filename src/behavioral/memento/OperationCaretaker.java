package behavioral.memento;

//메멘토 패턴
//객체의 내부를 노출하지 않으면서 객체의 상태를 저장하여 필요할때 객체 상태를 복원 하는 패턴
public class OperationCaretaker {

	public static void main(String[] args) {

		OperationOriginator operationOriginator = new OperationOriginator();

		operationOriginator.setFirstNumber(100);
		operationOriginator.setSecondNumber(10);

		operationOriginator.printOperations();
		
		System.out.println("create Memento");

		OperationMemento operationMemento = operationOriginator.createMemento();

		operationOriginator.setFirstNumber(60);
		operationOriginator.setSecondNumber(30);

		operationOriginator.printOperations();
		
		System.out.println("restore Memento");

		operationOriginator.setMemento(operationMemento);

		operationOriginator.printOperations();

	}

}

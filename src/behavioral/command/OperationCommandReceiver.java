package behavioral.command;

//명령을 받아 들이는 객체
//요구 사항을 처리 하기 위해서 어떤 일을 해야 하는지 알고 있는 객체
public class OperationCommandReceiver {

	private int result;

	public int getResult() {
		return result;
	}

	public void add(int value) {
		result += value;
	}

	public void substract(int value) {
		result -= value;
	}

	public void multiply(int value) {
		result *= value;
	}

	public void divide(int value) {
		result /= value;
	}

}

package behavioral.templateMethod;

//템플릿 메서드를 정의
//하위 클래스에서 사용될 추상 메서드를 선언
//템플릿 메서드는 기능 구현시 추상 메소드를 호출 하여 사용
public abstract class AbstractOperation {

	private int firstNumber;
	private int secondNumber;

	//실행 구분 구체적인 구현인 getOperator, getAnswer 2개 메서드는 추상 메서드로 구현체에서 정의
	//공통으로 사용되는 getFirstNumber, getSecondNumber, print는 여기에서 정의 및 사용
	public final void operate() {
		int firstNumber = getFirstNumber();
		int secondNumber = getSecondNumber();

		String operator = getOperator();

		int answer = getAnswer(firstNumber, secondNumber);

		String result = firstNumber + operator + secondNumber + " = " + answer;

		print(result);
	}

	protected abstract String getOperator();

	protected abstract int getAnswer(int firstNumber, int secondNumber);

	private void print(String result) {
		System.out.println(result);
	}

	private int getFirstNumber() {
		return firstNumber;
	}

	public final void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	private int getSecondNumber() {
		return secondNumber;
	}

	public final void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

}

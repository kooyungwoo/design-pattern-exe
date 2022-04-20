package produce.builder;

public abstract class AbstractOperationBuilder {
	protected StringBuffer result = new StringBuffer();
	
	private int firstNumber;
	private int secondNumber;
	
	//생성자 호출 시 인자값 전달
	public AbstractOperationBuilder(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	
	//계산 부분이라 구현시 변경이 필요해 추상 메소드로 작업
	public abstract int operate(int firstNumber, int secondNumber);
	
	//계산 시 +,-,*,/ 등 다르게 실행 되야 하는 부분으로 추상 메소드 작업
	public abstract void buildOperator();
	
	//모두 동일한 부분 이여서 추상 메소드 필요 없음(구현시 변경하지 못하게 final선언)
	public final void buildFirstNumber() {
		result.append(firstNumber);
	}
	
	//모두 동일한 부분 이여서 추상 메소드 필요 없음(구현시 변경하지 못하게 final선언)
	public final void buildSecondNumber() {
		result.append(secondNumber);
	}
	
	//모두 동일한 부분 이여서 추상 메소드 필요 없음(구현시 변경하지 못하게 final선언)
	public final void buildAnswer() {
		int answer = operate(firstNumber, secondNumber);
		
		result.append(" = "+answer);
	}
	
	//모두 동일한 부분 이여서 추상 메소드 필요 없음(구현시 변경하지 못하게 final선언)
	public final StringBuffer getResult() {
		return result;
	}
}

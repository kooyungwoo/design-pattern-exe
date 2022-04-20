package produce.factoryMethod;

public abstract class AbstractOperation {
	private int firstNumber;
	private int scondNumber;
	
	public final void operate() {
		int firstNumber = getFirstNumber();
		int scondNumber = getScondNumber();
		
		AbstractOperator operator = getOperator();
		String operatorDescription = operator.getDescription();
		
		int answer = operator.getAnswer(firstNumber, scondNumber);
		
		String result = firstNumber+operatorDescription+scondNumber+" = "+answer;
		
		print(result);
	}
	
	protected abstract AbstractOperator getOperator();
	
	private int getFirstNumber() {
		return firstNumber;
	}
	
	public final void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	
	private int getScondNumber() {
		return scondNumber;
	}
	
	public final void setScondNumber(int scondNumber) {
		this.scondNumber = scondNumber;
	}
	
	private void print(String result) {
		System.out.println(result);
	}
}

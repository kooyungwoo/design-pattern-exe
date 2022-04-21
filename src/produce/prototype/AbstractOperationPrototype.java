package produce.prototype;

public abstract class AbstractOperationPrototype {
	private int firstNumber;
	private int scondNumber;
	
	public AbstractOperationPrototype() {
		super();
	}
	
	public AbstractOperationPrototype(AbstractOperationPrototype operation) {
		this.firstNumber = operation.firstNumber;
		this.scondNumber = operation.scondNumber;
	}
	
	public abstract AbstractOperationPrototype getClone();
	
	public int getFirstNumber() {
		return firstNumber;
	}
	
	public final void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	
	public int getScondNumber() {
		return scondNumber;
	}
	
	public final void setScondNumber(int scondNumber) {
		this.scondNumber = scondNumber;
	}
	
	protected final void print(String result) {
		System.out.println(result);
	}
	
	protected abstract int getAnswer(int firstNumber, int scondNumber);
	
	protected abstract String getOperator();
	
	public final void operate() {
		int firstNumber = getFirstNumber();
		int scondNumber = getScondNumber();
		
		String operator = getOperator();
		
		int answer = getAnswer(firstNumber, scondNumber);
		
		String result = firstNumber+operator+scondNumber+" = "+answer;
		
		print(result);
	}
	
}

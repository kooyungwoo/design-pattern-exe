package produce.factory;

public class MultiplyOperationProduct extends AbstractOperationProduct{
	
	public void operate(int firstNumber, int secondNumber){
		int answer = firstNumber * secondNumber;
		
		System.out.println(firstNumber + " * " + secondNumber + " = " +  answer);
	}
	
}

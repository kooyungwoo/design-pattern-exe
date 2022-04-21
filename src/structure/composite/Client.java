package structure.composite;

//컴포지트 패턴
public class Client {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();

		int firstNumber = 100;
		int secondNumber = 20;

		NumberExpression firstNumberEquation = new NumberExpression(firstNumber);

		calculator.setExpression(firstNumberEquation);
		System.out.println("firstNumber = " + calculator.calculate());

		NumberExpression secondNumberEquation = new NumberExpression(secondNumber);

		calculator.setExpression(secondNumberEquation);
		System.out.println("secondNumber = " + calculator.calculate());

		AbstractOperationExpression addOperationExpression = new AddOperationExpression();
		addOperationExpression.addOperandExpression(firstNumberEquation);
		addOperationExpression.addOperandExpression(secondNumberEquation);

		calculator.setExpression(addOperationExpression);
		System.out.println(firstNumber + " + " + secondNumber + " = " + calculator.calculate());

		AbstractOperationExpression substractOperationExpression = new SubstractOperationExpression();
		substractOperationExpression.addOperandExpression(firstNumberEquation);
		substractOperationExpression.addOperandExpression(secondNumberEquation);

		calculator.setExpression(substractOperationExpression);
		System.out.println(firstNumber + " - " + secondNumber + " = " + calculator.calculate());
		
		AbstractOperationExpression multiplyOperationExpression = new MultiplyOperationExpression();
		multiplyOperationExpression.addOperandExpression(firstNumberEquation);
		multiplyOperationExpression.addOperandExpression(secondNumberEquation);

		calculator.setExpression(multiplyOperationExpression);
		System.out.println(firstNumber + " * " + secondNumber + " = " + calculator.calculate());
		
		AbstractOperationExpression divideOperationExpression = new DivideOperationExpression();
		divideOperationExpression.addOperandExpression(firstNumberEquation);
		divideOperationExpression.addOperandExpression(secondNumberEquation);

		calculator.setExpression(divideOperationExpression);
		System.out.println(firstNumber + " / " + secondNumber + " = " + calculator.calculate());
	}

}

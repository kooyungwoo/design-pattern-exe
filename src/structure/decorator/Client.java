package structure.decorator;

//데커레이터 패턴
/*
 * 기본 기능을 하는 객체와 다양한 부가 기능을 하는 데코레이터들을 조합하여 기능을 확장 할 수 있는 패턴
 * 
 * 기본 기능+다양한 부가 기능이 존재 하는 경우
 * 부가 기능이 기본 기능을 활용 하는 경우
 * 부가 기능이 여러 가지 방식으로 조합이 가능 한 경우
 * 
 * 많은 부가 기능을 생성 할 수 있다.
 * 실시간으로 특정한 객체에 다양한 행동을 부여 할 수 있다.
 * 
 * java.io 패키지의 자바I/O API
 * 자바 Component의 Border
 * */
public class Client {
	
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		int firstNumber = 80;
		int secondNumber = 20; 
		
		//계산을 위한 첫번째 인자값 설정
		NumberExpression firstNumberEquation = new NumberExpression(firstNumber);
		
		calculator.setExpression(firstNumberEquation);		
		System.out.println("firstNumber = " + calculator.calculate());
		
		//계산을 위한 두번째 인자값 설정
		NumberExpression secondNumberEquation = new NumberExpression(secondNumber);
		
		calculator.setExpression(secondNumberEquation);		
		System.out.println("secondNumber = " + calculator.calculate());
		
		AbstractOperationExpression addOperatorEquation = new AddOperationExpression();
		addOperatorEquation.addOperandExpression(firstNumberEquation);
		addOperatorEquation.addOperandExpression(secondNumberEquation);
		
		calculator.setExpression(addOperatorEquation);		
		System.out.println(firstNumber + " + " + secondNumber + " = " + calculator.calculate());
				
		calculator.setExpression(new SqrtDecoratorExpression(addOperatorEquation));		
		System.out.println("SQRT(" + firstNumber + " + " + secondNumber + ") = " + calculator.calculate());
		
		calculator.setExpression(new FracDecoratorExpression(addOperatorEquation));		
		System.out.println("FRAC(" + firstNumber + " + " + secondNumber + ") = " + calculator.calculate());
		
		int exponent = 2;
		calculator.setExpression(new PowDecoratorExpression(addOperatorEquation, exponent));		
		System.out.println("POW(" + firstNumber + " + " + secondNumber + ") = " + calculator.calculate());
		
	}

}

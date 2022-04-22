package structure.composite;

//컴포지트 패턴
/*
 * 부분-전체의 관계를 갖는 객체들을 동일한 방식으로 다루는 패턴
 * 데이터 구조를 계층적으로 표한 할 수 있습니다.
 * 객체들이 부분-전체의 관계를 갖습니다.
 * 
 * 전체나 부분이냐에 상관 없이 클라이언트는 단일 인터페이스로 기능을 실행 할 수 있습니다.
 * 복합 객체와 개별 객체에 대해 똑같은 작업을 적용 할 수 있습니다.
 * 
 * 컴퓨터에 존재하는 파일 시스템(디렉토리와 파일로 구성)
 * */
public class Client {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();

		int firstNumber = 100;
		int secondNumber = 20;

		//계산시 사용할 값을 셋팅
		NumberExpression firstNumberEquation = new NumberExpression(firstNumber);

		calculator.setExpression(firstNumberEquation);
		System.out.println("firstNumber = " + calculator.calculate());

		//계산시 사용할 값을 셋팅
		NumberExpression secondNumberEquation = new NumberExpression(secondNumber);

		calculator.setExpression(secondNumberEquation);
		System.out.println("secondNumber = " + calculator.calculate());

		//계산 메소드 더하기로 구현한 class생성 후 주입
		AbstractOperationExpression addOperationExpression = new AddOperationExpression();
		addOperationExpression.addOperandExpression(firstNumberEquation);
		addOperationExpression.addOperandExpression(secondNumberEquation);
		
		//계산 호출을 위해 calculator 셋팅 및 호출 아래와 같이 calculator 없이 처리 가능
		//System.out.println(firstNumber + " + " + secondNumber + " = " + addOperationExpression.operate());
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

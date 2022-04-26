package behavioral.strategy;

//스트래티지 패턴
//알고리즘을 클래스화해서 객체의 행동을 쉽게 변경 할 수 있는 패턴
public class Client {

	public static void main(String[] args) throws Exception {

		//수행 객체를 변경 하고 연결 해주는 메소드
		OperationContext operationContext = new OperationContext();

		int firstNumber = 100;
		int secondNumber = 20;

		AbstractOperationStrategy[] operationStrategies = {
				new AddOperationStrategy(), new SubstractOperationStrategy(),
				new MultiplyOperationStrategy(), new DivideOperationStrategy() };

		for (int i = 0; i < operationStrategies.length; i++) {
			operationContext.setOperationStrategy(operationStrategies[i]);
			operationContext.operate(firstNumber, secondNumber);
		}

	}

}

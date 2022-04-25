package structure.facade;

//퍼사드 패턴
//하나의 문제를 해결하기 위해서 여러 클래스에서 제공하는 기능을 이용해야 하는데 그 방식이 너무 복잡하여 창구 역할을 하는 클래스를 내새워
//이용 방식을 단순하게 반드는 패턴
public class Client {

	public static void main(String[] args) throws Exception {
		CalculatorFacade calculator = new CalculatorFacade();

		String[] expressions = { "100+20", "100-20", "100*20", "100/20" };

		for (int i = 0; i < expressions.length; i++) {
			calculator.calculate(expressions[i]);
		}
	}

}

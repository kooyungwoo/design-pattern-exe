package structure.decorator;

//계산에 필요한 값을 정의하는 클래스 AbstractExpression 을 상속 및 구현 해서 
//protected ArrayList<AbstractExpression> operandList = new ArrayList<AbstractExpression>(); 에 추가 가능한 데이터로 활용
public class NumberExpression extends AbstractExpression {

	private int value;

	public NumberExpression(int value) {
		this.value = value;
	}

	public double operate() {
		return value;
	}

}

package structure.decorator;

import java.util.ArrayList;

//차상위 인터페이스 AbstractExpression 상속한 추상클래스 operandList에 계산을 위한 값을 추가 하기 위해 확장된 기능 구현
public abstract class AbstractOperationExpression extends AbstractExpression {

	protected ArrayList<AbstractExpression> operandList = new ArrayList<AbstractExpression>();

	public final void addOperandExpression(AbstractExpression operandExpression) {
		operandList.add(operandExpression);
	}

}

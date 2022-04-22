package structure.decorator;

//부가 기능 확장을 위한 추상 클래스
//확장 클래스는 해당 추상 클래스를 구현
public abstract class AbstractDecoratorExpression extends AbstractExpression{
	
	protected AbstractExpression expression;
	
	protected AbstractDecoratorExpression(){
		super();
	}
	
	public AbstractDecoratorExpression(AbstractExpression expression){
		this.expression = expression;
	}

	public void setExpression(AbstractExpression expression) {
		this.expression = expression;
	}

}

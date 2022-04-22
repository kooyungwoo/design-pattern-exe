package structure.decorator;

public class SqrtDecoratorExpression extends AbstractDecoratorExpression{
	
	public SqrtDecoratorExpression(){
		super();
	}
	
	public SqrtDecoratorExpression(AbstractExpression expression){
		super(expression);
	}
	
	public double operate(){		
		return Math.sqrt(expression.operate());
	}
	
}

package structure.decorator;

public class FracDecoratorExpression extends AbstractDecoratorExpression{
	
	public FracDecoratorExpression(){
		super();
	}
	
	public FracDecoratorExpression(AbstractExpression expression){
		super(expression);
	}
	
	public double operate(){				
		return 1 / expression.operate();
	}

}

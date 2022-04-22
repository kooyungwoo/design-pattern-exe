package structure.decorator;

public class PowDecoratorExpression extends AbstractDecoratorExpression{
	
	private int exponent = 2;
	
	public PowDecoratorExpression(){
		super();
	}
	
	public PowDecoratorExpression(AbstractExpression expression, int exponent){
		super(expression);
		
		this.exponent = exponent;
	}
	
	public double operate(){		
		return Math.pow(this.expression.operate(), exponent);
	}
	
}

package produce.builder;

public class OperationDirector {
	private AbstractOperationBuilder builder;
	
	public OperationDirector(AbstractOperationBuilder builder) {
		this.builder = builder;
	}
	
	public void construct() {
		builder.buildFirstNumber();
		builder.buildOperator();
		builder.buildSecondNumber();
		builder.buildAnswer();
		
		StringBuffer result = builder.getResult();
		
		print(result);
	}
	
	public void print(StringBuffer result) {
		System.out.println(result);
	}
}

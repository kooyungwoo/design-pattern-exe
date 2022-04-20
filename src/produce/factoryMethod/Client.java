package produce.factoryMethod;

public class Client {
	//팩토리 메서드 패턴
	public static void main(String[] args) {
		int firstNumber = 100;
		int secondNumber = 20;
		
		AbstractOperation[] operations = {new AddOperation(), new SubstractOperation(), new MultiplyOperation(), new DivideOperation()};
		
		for(int i=0; i<operations.length; i++) {
			operations[i].setFirstNumber(firstNumber);
			operations[i].setScondNumber(secondNumber);
			
			operations[i].operate();
		}
	}
}

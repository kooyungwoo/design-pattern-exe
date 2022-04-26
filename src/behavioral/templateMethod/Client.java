package behavioral.templateMethod;

//템플릿 메서드 패턴
//상위 클래스에서 알고리즘의 골격(동작 방식 구조)을 정하고 알고리즘의 여러 단계 중 일부는 하위클래스에서 재정의하는 패턴
public class Client {

	public static void main(String[] args) {

		int firstNumber = 100;
		int secondNumber = 20;

		AbstractOperation[] operations = { new AddOperation(),
				new SubstractOperation(), new MultiplyOperation(),
				new DivideOperation() };

		for (int i = 0; i < operations.length; i++) {
			operations[i].setFirstNumber(firstNumber);
			operations[i].setSecondNumber(secondNumber);

			operations[i].operate();
		}

	}

}

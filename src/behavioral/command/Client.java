package behavioral.command;

//커맨드 패턴
/*
 * 객체의 행동을 변화시키는 요구나 명령을 클래스로 표현
 * 
 * 객체의 다양한 행동이 존재
 * 실행을 취소하거나 재실행 하는 기능이 존재
 * 명령을 내리는 시점과 실제 명령을 수행하는 시점이 다른 경우
 * 
 * 객체의 행동을 별도의 클래스에 캡슐화 해서 해동 객체에 확장성을 부여
 * 각각의 커맨드들은 특정 객체에 의존하지 않도록 만들어 지므로 재활요엉이 매우 높음
 * 어떤 작업을 요청한 쪽과 그 작업을 처리하는 쪽 분리가 가능
 * */
public class Client {

	public static void main(String[] args) {

		//행동을 정의하는 receiver class
		OperationCommandReceiver receiver = new OperationCommandReceiver();
		
		int result = receiver.getResult();
		
		System.out.println("result = " + result);

		//command class에서 자신이 필요한 receiver 메소드를 호출하는 execute 메소드 실행
		AddOperationCommand addCommand = new AddOperationCommand(receiver, 20);
		addCommand.execute();

		result = receiver.getResult();
		System.out.println("result + 20 = " + result);

		SubstractOperationCommand substractCommand = new SubstractOperationCommand(receiver, 10);
		substractCommand.execute();

		result = receiver.getResult();
		System.out.println("result - 10 = " + result);

		MultiplyOperationCommand multiplyCommand = new MultiplyOperationCommand(receiver, 10);
		multiplyCommand.execute();

		result = receiver.getResult();
		System.out.println("result * 10 = " + result);

		DivideOperationCommand divideCommand = new DivideOperationCommand(receiver, 10);
		divideCommand.execute();

		result = receiver.getResult();
		System.out.println("result / 10 = " + result);

	}

}

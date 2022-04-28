package behavioral.command;

public class DivideOperationCommand extends AbstractOperationCommand {

	public DivideOperationCommand(OperationCommandReceiver receiver, int value) {
		super(receiver, value);
	}

	//execute 구현시 receiver 중 자신이 필요한 행동을 통해서 구현
	@Override
	public void execute() {
		receiver.divide(value);
		//브랜치 관련 테스트2 수정 후 master merge되는지
	}

}

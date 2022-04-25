package behavioral.command;

public class MultiplyOperationCommand extends AbstractOperationCommand {

	public MultiplyOperationCommand(OperationCommandReceiver receiver, int value) {
		super(receiver, value);
	}

	//execute 구현시 receiver 중 자신이 필요한 행동을 통해서 구현
	@Override
	public void execute() {
		receiver.multiply(value);
	}

}

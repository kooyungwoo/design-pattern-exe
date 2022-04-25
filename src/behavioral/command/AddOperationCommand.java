package behavioral.command;

public class AddOperationCommand extends AbstractOperationCommand {

	public AddOperationCommand(OperationCommandReceiver receiver, int value) {
		super(receiver, value);
	}

	//execute 구현시 receiver 중 자신이 필요한 행동을 통해서 구현
	@Override
	public void execute() {
		receiver.add(value);
	}

}

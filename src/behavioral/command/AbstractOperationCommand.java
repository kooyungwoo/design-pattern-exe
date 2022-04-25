package behavioral.command;

//객체 행동 제어를 위한 추상 클래스
public abstract class AbstractOperationCommand {

	protected OperationCommandReceiver receiver;
	protected int value;

	public AbstractOperationCommand(OperationCommandReceiver receiver, int value) {
		this.receiver = receiver;
		this.value = value;
	}
	
	public abstract void execute();
}

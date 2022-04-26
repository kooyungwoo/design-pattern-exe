package behavioral.state;

public class StartState implements IState {

	private static StartState singleton = new StartState();

	private StartState() {
		super();
	}

	public static IState getInstance() {
		return singleton;
	}

	@Override
	public void action(IContext context, String actionCommand) {
		context.updateDisplay(actionCommand);

		context.changeState(InputState.getInstance());
	}

	@Override
	public String toString() {
		return "StartState";
	}

}

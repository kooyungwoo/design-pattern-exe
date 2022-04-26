package behavioral.state;

public class InputState implements IState {

	private static InputState singleton = new InputState();

	private InputState() {
		super();
	}

	public static IState getInstance() {
		return singleton;
	}

	@Override
	public void action(IContext context, String actionCommand) {

		if (context.isOperator(actionCommand)) {
			context.calculate();
			context.setLastOperator(actionCommand);

			context.changeState(OperatorState.getInstance());
		} 
		else {
			context.appendInputToDisplay(actionCommand);
		}
	}

	@Override
	public String toString() {
		return "InputState";
	}

}
